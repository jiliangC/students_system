package main_information;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Set_Table {
    public Set_Table(JTable table1,String[][] str_s){

        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();//单元格渲染器
        tcr.setHorizontalAlignment(JLabel.CENTER);//居中显示
        table1.setDefaultRenderer(Object.class, tcr);//设置渲染器
        table1.setRowHeight(20); //设置行高
        table1.setModel(new DefaultTableModel(
                str_s,
                new String[]{
                        "\u5b66\u53f7", "\u59d3\u540d", "\u6027\u522b", "\u8bed\u6587", "\u6570\u5b66", "\u82f1\u8bed", "\u603b\u5206"
                }
        ) {
            Class<?>[] columnTypes = new Class<?>[]{
                    String.class, Object.class, Object.class, Object.class, Object.class, Object.class, Object.class
            };
            //单元格不可编辑
            boolean[] columnEditable = new boolean[]{
                    false, false, false, false, false, false, false
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
