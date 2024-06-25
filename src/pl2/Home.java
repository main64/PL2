package pl2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Home implements ActionListener{
    final String RESERVE_SITUATION = "予約状況";
    final String RESERVE = "予約";
    final String MYPAGE = "マイページ";
    
    Home() {
        // JFrameの作成
        JFrame frame = new JFrame("ホーム");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        
        // メインパネルの作成
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // タイトルラベルの作成
        JLabel reserveSituationL = new JLabel(RESERVE_SITUATION, JLabel.CENTER);
        mainPanel.add(reserveSituationL, BorderLayout.NORTH);

        // ボタンパネルの作成
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));

        // ボタンの作成
        JButton reserveB = new JButton(RESERVE);
        JButton mypageB = new JButton(MYPAGE);

        reserveB.addActionListener(this);
        mypageB.addActionListener(this);
        // ボタンを中央に配置するためにラップするパネルの作成
        JPanel wrapper1 = new JPanel();
        wrapper1.setLayout(new BoxLayout(wrapper1, BoxLayout.X_AXIS));
        wrapper1.add(Box.createHorizontalGlue());
        wrapper1.add(reserveB);
        wrapper1.add(Box.createHorizontalGlue());

        JPanel wrapper2 = new JPanel();
        wrapper2.setLayout(new BoxLayout(wrapper2, BoxLayout.X_AXIS));
        wrapper2.add(Box.createHorizontalGlue());
        wrapper2.add(mypageB);
        wrapper2.add(Box.createHorizontalGlue());

        // ボタンパネルにラップしたボタンを追加
        buttonPanel.add(Box.createVerticalGlue());
        buttonPanel.add(wrapper1);
        buttonPanel.add(Box.createVerticalStrut(20)); // ボタン間のスペース
        buttonPanel.add(wrapper2);
        buttonPanel.add(Box.createVerticalGlue());

        // ボタンパネルを中央に追加
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        // メインパネルをフレームに追加
        frame.add(mainPanel);

        // フレームを表示
        frame.setVisible(true);
    }



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO 自動生成されたメソッド・スタブ
		switch(e.getActionCommand()) {
		case RESERVE:
			break;
		case MYPAGE:
			Mypage mypage=new Mypage();
			break;
		}
	}
}
