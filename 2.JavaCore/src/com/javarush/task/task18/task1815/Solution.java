package com.javarush.task.task18.task1815;

import java.util.ArrayList;
import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface {
        TableInterface t;


        public TableInterfaceWrapper(TableInterface ti) {
            this.t = ti;

        }

        @Override
        public void setModel(List rows) {
            t.setModel(rows);
            System.out.println(rows.size());
        }

        @Override
        public String getHeaderText() {
            return t.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            t.setHeaderText(newHeaderText);

        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}