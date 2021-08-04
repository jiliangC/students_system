package main_information;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.table.*;
import java.awt.*;


class MyCellEditor extends DefaultCellEditor {
    int judge;

    public MyCellEditor(JTextField textField,int judge) {
        super(textField);
        this.judge=judge;
    }
    @Override
    public boolean stopCellEditing() {
        // 获取当前单元格的编辑器组件
        Component comp = getComponent();
        // 获取当前单元格编辑器输入的值
        Object obj = getCellEditorValue();
        // 如果当前单元格编辑器输入的值不是数字，则返回 false（表示数据非法，不允许设置，无法保存）
        if (judge==6){
            if (obj == null || !obj.toString().matches("[0-9]{0,3}")||Integer.parseInt(obj.toString())>100||Integer.parseInt(obj.toString())<0) {
                // 数据非法时，设置编辑器组件内的内容颜色为红色
                comp.setForeground(Color.RED);
                JOptionPane.showMessageDialog(null,"请输入正确的格式");
                return false;
            }
        }else if (judge==2){
            if (obj == null || !(obj.toString().equals("男")||obj.toString().equals("女"))){
                comp.setForeground(Color.RED);
                JOptionPane.showMessageDialog(null,"请输入男或女");
                return false;
            }
        }

        // 数据合法时，设置编辑器组件内的内容颜色为黑色
        comp.setForeground(Color.BLACK);
        // 合法数据交给父类处理
        return super.stopCellEditing();
    }
}


public class Set_Table {
    public Set_Table(JTable table1,String[][] str_s,int judge){
        String[] columnNames = { "学号", "姓名", "性别", "语文", "数学", "英语", "总分"};
        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();//单元格渲染器

        tcr.setHorizontalAlignment(JLabel.CENTER);//居中显示
        table1.setDefaultRenderer(Object.class, tcr);//设置渲染器
        table1.setRowHeight(20); //设置行高
        if (judge==0){
            table1.setModel(new DefaultTableModel(
                    str_s,
                    columnNames
            ) {
                //单元格不可编辑
                final boolean[] columnEditable = new boolean[]{
                        false, false, false, false, false, false, false
                };
                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return columnEditable[columnIndex];
                }
            });
        }//单元格不可编辑
        else {
            table1.setModel(new DefaultTableModel(
                    str_s,
                    columnNames
            ) {
                final Class<?>[] columnTypes = new Class<?>[]{
                        String.class, String.class, String.class, Integer.class,Integer.class, Integer.class, Integer.class
                };
                final boolean[] columnEditable = new boolean[]{
                        false, true, true, true, true, true, false
                };

                @Override
                public Class<?> getColumnClass(int columnIndex) {
                    return columnTypes[columnIndex];
                }

                @Override
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return columnEditable[columnIndex];
                }
            });

            final TableModel tableModel = table1.getModel();
            // 在 表格模型上 添加 数据改变监听器
            tableModel.addTableModelListener(e -> {
                // 获取 第一个 和 最后一个 被改变的行（只改变了一行，则两者相同）
                int row = e.getFirstRow();
                // 获取被改变的列
                int column = e.getColumn();
                int type = e.getType();
                // 针对 现有数据的更改 更新其他单元格数据
                if (type == TableModelEvent.UPDATE) {
                    // 只处理 语文、数学、英语 这三列（索引分别为3、4、5）的分数的更改
                    if (column < 3 || column > 5) {
                        return;
                    }
                    // 获取当前行的 语文、数学、英语 的值
                    Object chineseObj = tableModel.getValueAt(row, 3);
                    Object mathObj = tableModel.getValueAt(row, 4);
                    Object englishObj = tableModel.getValueAt(row, 5);
                    // 把对象值转换为数值
                    int chinese = 0,math=0,english=0;
                    try {
                        chinese = Integer.parseInt("" + chineseObj);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    try {
                        math = Integer.parseInt("" + mathObj);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    try {
                        english = Integer.parseInt("" + englishObj);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                    // 重新计算新的总分数
                    int totalScore = chinese + math + english;
                    // 将新的分数值设置到总分单元格（总分数的列索引为4）
                    tableModel.setValueAt(totalScore, row, 6);

                }
            });

            // 创建单元格编辑器，使用文本框作为编辑组件


            // 遍历表格中所有数字列，并设置列单元格的编辑器
            MyCellEditor cellEditor;
            String[] c={"性别","语文", "数学", "英语"};
            for (String s : c) {
                if (s.equals("性别")){
                    cellEditor = new MyCellEditor(new JTextField(),2);
                }
                else{
                    cellEditor = new MyCellEditor(new JTextField(),6);
                }
                // 根据 列名 获取 表格列
                TableColumn tableColumn = table1.getColumn(s);
                // 设置 表格列 的 单元格编辑器
                tableColumn.setCellEditor(cellEditor);
            }


        }//单元格可编辑
        {
            //单元格不可拉伸
            TableColumnModel cm = table1.getColumnModel();
            cm.getColumn(0).setResizable(false);
            cm.getColumn(1).setResizable(false);
            cm.getColumn(2).setResizable(false);
            cm.getColumn(3).setResizable(false);
            cm.getColumn(4).setResizable(false);
            cm.getColumn(5).setResizable(false);
            cm.getColumn(6).setResizable(false);
        }
    }

}
