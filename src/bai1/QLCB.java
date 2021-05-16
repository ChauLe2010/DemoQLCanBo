package bai1;

import java.util.Scanner;

public class QLCB {
    CanBo[] dscb;
    int index;

    public QLCB() {
        dscb=new CanBo[100];
        index=0;
    }

    public QLCB(CanBo[] dscb) {
        this.dscb = dscb;
    }
    void themCanBo(){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        CanBo cb=new CanBo("name",20,"Nam","address");
        dscb[index]=cb;
        index++;
    }
    void hienThiCanBo(){
        for(int i=0;i<index;i++){
            System.out.println(dscb[i].toString());
        }
    }
}
