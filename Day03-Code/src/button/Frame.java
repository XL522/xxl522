package button;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Frame {
    public static void main(String[] args) {
        //创建窗体对象
        JFrame frame =new JFrame();
        frame.setSize(1080,1057);
        //修改默认关闭模式
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //关闭组件默认布局
        frame.setLayout(null);
        frame.setTitle("帅哥");

        //创建按钮对象
        JButton btu=new JButton("点击");
        btu.setBounds(300,600,200,200);
        btu.setFocusPainted(false);
        btu.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("wow");
            }
        });
        btu.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                System.out.println("关键");
            }
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                System.out.println("按下");
            }
        });
        //添加按钮组件
        frame.getContentPane().add(btu);

        JLabel test=new JLabel("帅哥的头像");
        test.setBounds(500,100,100,200);
        frame.getContentPane().add(test);

        //创建JLabel组件添加图片
        JLabel jLabel=new JLabel(new ImageIcon("C:\\Users\\x'x'x\\Desktop\\5.png"));
        jLabel.setBounds(0,0,1080,1057);
        //添加JLabel组件
        frame.getContentPane().add(jLabel);

        //显示窗口
        frame.setVisible(true);
    }
}