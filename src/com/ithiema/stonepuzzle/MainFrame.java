package com.ithiema.stonepuzzle;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class MainFrame extends JFrame implements KeyListener {
        int cuont;//统计步数的变量
        int[][] data ={{1,2,3,4,},
                    {5,6,7,8,},
                    {9,10,11,12},
                    {13,14,15,0}};
        int[][] win=new int[][]{{1,2,3,4,},
                    {5,6,7,8,},
                    {9,10,11,12},
                    {13,14,15,0}};
        int row;//0号元素行坐标
        int colum;//0号元素列坐标
        public MainFrame(){
            this.addKeyListener(this);
            initFrame();
            initData();
            painView();
            setVisible(true);
        }
        public void initFrame(){

            setTitle("石头迷阵V1.0版本");
            setSize(514,595);
            super.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            //设置窗体置顶
            setAlwaysOnTop(true);
            //设置窗体居中
            setLocationRelativeTo(null);
            setLayout(null);


        }

        public void painView(){
            super.getContentPane().removeAll();
            if (victory()){
                JLabel jLabel=new JLabel(new ImageIcon("C:\\Users\\x'x'x\\Desktop\\win.png"));
                jLabel.setBounds(124,230,266,88);
                getContentPane().add(jLabel);
            }

            JButton btu=new JButton("重新游戏");
            btu.setBounds(350,20,100,20);
            getContentPane().add(btu);
            btu.setFocusable(false);
            btu.addActionListener(e -> {
                cuont=0;
                initData();
                painView();
            });

            JLabel scoreLabel=new JLabel("步数："+cuont);
            scoreLabel.setBounds(50,20,100,20);
            getContentPane().add(scoreLabel);

            for (int i = 0; i <data.length ; i++) {
                for (int j=0;j<data[i].length;j++){
                    JLabel jLabel1=new JLabel(new ImageIcon("C:\\Users\\x'x'x\\Desktop\\"+ data[i][j]+".png"));
                    jLabel1.setBounds(50+j*100,90+i*100,100,100);
                    super.getContentPane().add(jLabel1);
                }
            }
            JLabel jLabel=new JLabel(new ImageIcon("C:\\Users\\x'x'x\\Desktop\\background.png"));
            jLabel.setBounds(0,30,500,500);
            super.getContentPane().add(jLabel);
            super.getContentPane().repaint();
        }
//打乱二维数组
        public  void initData() {
            Random r=new Random();
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    int randomx=r.nextInt(4);
                    int randomy=r.nextInt(4);

                    int teme=data[i][j];
                    data[i][j]=data[randomx][randomy];
                    data[randomx][randomy]=teme;
                }
            }
            for (int i = 0; i < data.length; i++) {
                for (int j = 0; j < data[i].length; j++) {
                    if (data[i][j]==0){
                         row=i;
                         colum=j;
                    }
                }
            }

    }
        private  void move(int keyCode) {
        if (victory()){
            return;
        }
        if (keyCode ==37){
            //空白快和右边的数字交换
            if (colum==3){
                return;
            }else {
                int tema=data[row][colum];
                data[row][colum]=data[row][colum+1];
                data[row][colum+1]=tema;
                colum++;
                cuont++;
            }

        }else if (keyCode ==38){
            //空白快和下边的数字交换
            if (row==3){
                return;
            }else {
                int tema=data[row][colum];
                data[row][colum]=data[row+1][colum];
                data[row+1][colum]=tema;
                row++;
                cuont++;
            }

        }else if (keyCode ==39){
            //空白快和左边的数字交换
            if (colum==0){
                return;
            }else {

            }
            int tema=data[row][colum];
            data[row][colum]=data[row][colum-1];
            data[row][colum-1]=tema;
            colum--;
            cuont++;
        }else if (keyCode ==40){
            //空白快和上边的数字交换
            if (row==0){
                return;
            }else {
                int tema=data[row][colum];
                data[row][colum]=data[row-1][colum];
                data[row-1][colum]=tema;
                row--;
                cuont++;
            }

        }else if (keyCode==(int)'Z'){
            data=new int[][]{{1,2,3,4,},
                    {5,6,7,8,},
                    {9,10,11,12},
                    {13,14,15,0}};
            cuont++;
        }
    }

    @Override
        public void keyPressed(KeyEvent e) {
        int keyCode=e.getKeyCode();
        move(keyCode);
        painView();


    }
//此方法用于处理移动业务



    @Override
        public void keyTyped(KeyEvent e) {

    }

    @Override
        public void keyReleased(KeyEvent e) {

    }
        public boolean victory(){

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (data[i][j]!=win[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
