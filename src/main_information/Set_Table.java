package main_information;

import javax.swing.*;
import javax.swing.event.TableModelEvent;
import javax.swing.table.*;
import java.awt.*;


class MyCellEditor extends DefaultCellEditor {

    public MyCellEditor(JTextField textField) {
        super(textField);
    }

    public MyCellEditor(JCheckBox checkBox) {
        super(checkBox);
    }

    public MyCellEditor(JComboBox comboBox) {
        super(comboBox);
    }

    @Override
    public boolean stopCellEditing() {
        // 获取当前单元格的编辑器组件
        Component comp = getComponent();

        // 获取当前单元格编辑器输入的值
        Object obj = getCellEditorValue();

        // 如果当前单元格编辑器输入的值不是数字，则返回 false（表示数据非法，不允许设置，无法保存）
        if (obj == null || !obj.toString().matches("[0-9]*")||Integer.parseInt(obj.toString())>100||Integer.parseInt(obj.toString())<0) {
            // 数据非法时，设置编辑器组件内的内容颜色为红色
            comp.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null,"请输入正确的格式");
            return false;
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
                boolean[] columnEditable = new boolean[]{
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
                Class<?>[] columnTypes = new Class<?>[]{
                        String.class, String.class, String.class, Integer.class,Integer.class, Integer.class, Integer.class
                };
                //单元格不可编辑
                boolean[] columnEditable = new boolean[]{
                        true, true, true, true, true, true, false
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
                int firstRow = e.getFirstRow();
                int lastRow = e.getLastRow();
                // 获取被改变的列
                int column = e.getColumn();
                int type = e.getType();
                // 针对 现有数据的更改 更新其他单元格数据
                if (type == TableModelEvent.UPDATE) {
                    // 只处理 语文、数学、英语 这三列（索引分别为1、2、3）的分数的更改
                    if (column < 3 || column > 5) {
                        return;
                    }
                    // 遍历每一个修改的行，单个学科分数更改后同时更新总分数
                    for (int row = firstRow; row <= lastRow; row++) {
                        // 获取当前行的 语文、数学、英语 的值
                        Object chineseObj = tableModel.getValueAt(row, 3);
                        Object mathObj = tableModel.getValueAt(row, 4);
                        Object englishObj = tableModel.getValueAt(row, 5);
                        // 把对象值转换为数值
                        int chinese = 0;
                        try {
                            chinese = Integer.parseInt("" + chineseObj);
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        int math = 0;
                        try {
                            math = Integer.parseInt("" + mathObj);
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                        int english = 0;
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
                }
            });

            // 创建单元格编辑器，使用文本框作为编辑组件
            MyCellEditor cellEditor = new MyCellEditor(new JTextField());

            // 遍历表格中所有数字列，并设置列单元格的编辑器
            String[] c={"语文", "数学", "英语"};
            for (int i = 0; i < c.length; i++) {
                // 根据 列名 获取 表格列
                TableColumn tableColumn = table1.getColumn(c[i]);
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
