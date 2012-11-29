package agronomm.lesson11;

import agronomm.lesson10.Minus;
import agronomm.lesson10.Operation;
import agronomm.lesson10.Pluss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created with IntelliJ IDEA.
 * User: Ленчик
 * Date: 29.11.12
 * Time: 22:30
 * To change this template use File | Settings | File Templates.
 */
public class SomeTest {

    public static void main(String[] args) throws IOException {
        OperList operList = new OperList(40);
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String operation;
        Operation oper = null;




        int a = Integer.parseInt(buff.readLine());
        operation = buff.readLine();
        if (operation.equals("+")) {
            oper = new Pluss();
        } else if (operation.equals("-")) {
            oper = new Minus();
        }
        oper.setA(a);
        int b = Integer.parseInt(buff.readLine());
        oper.setB(b);
        operList.add(oper);
        while (true) {
            operation = buff.readLine();
            if (operation.equals("+")) {
                oper = new Pluss();
            } else if (operation.equals("-")) {
                oper = new Minus();
            } else if (operation.equals("=")) {
                calculate(operList);
                return;
            } else {
                continue;
            }
            b = Integer.parseInt(buff.readLine());
            oper.setB(b);
            operList.add(oper);
        }
    }

    public static void calculate(OperList opers) {
        Operation promezhutochnayaOperaciya;
        promezhutochnayaOperaciya = opers.getFirst();
        double tmpRes = promezhutochnayaOperaciya.doOperation();
        while (opers.hasMore()) {
            promezhutochnayaOperaciya = opers.getNext();
            promezhutochnayaOperaciya.setA(tmpRes);
            tmpRes = promezhutochnayaOperaciya.doOperation();
        }
        System.out.println("result = " + tmpRes);

    }
}
