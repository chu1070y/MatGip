//메인
package org.zerock;

public class Main2 {

    public static void main(String[] args) {

        MatGipService service = new MatGipService();
        MatGipUI ui = new MatGipUI(service);

        ui.init();
    }
}