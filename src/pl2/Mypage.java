package pl2;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Mypage {
    final String ID_LABEL = "あなたのID";
    final String FRIENDS_LIST = "友達を表示";
    final String ADD_FRIEND = "友達を追加";
    final String PROMPT = "IDを入力してください";
    final String HISTORY = "予約履歴";
    final String USER_ID = "12345678";
    
    Mypage() {
        // JFrameの作成
        JFrame frame = new JFrame("ホーム");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        
        // メインパネルの作成
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        
        // ユーザーIDの表示
        JPanel idPanel = new JPanel();
        idPanel.setLayout(new BoxLayout(idPanel, BoxLayout.X_AXIS));
        idPanel.add(Box.createHorizontalGlue());
        idPanel.add(new JLabel(ID_LABEL));
        idPanel.add(Box.createHorizontalStrut(10)); // IDラベルとユーザーIDの間のスペース
        idPanel.add(new JLabel(USER_ID));
        idPanel.add(Box.createHorizontalGlue());
        mainPanel.add(idPanel);
        
        // 友達を表示ボタン
        JButton friendsButton = new JButton(FRIENDS_LIST);
        friendsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("友達を表示ボタンが押されました");
            }
        });
        JPanel friendsButtonPanel = new JPanel();
        friendsButtonPanel.setLayout(new BoxLayout(friendsButtonPanel, BoxLayout.X_AXIS));
        friendsButtonPanel.add(Box.createHorizontalGlue());
        friendsButtonPanel.add(friendsButton);
        friendsButtonPanel.add(Box.createHorizontalGlue());
        mainPanel.add(Box.createVerticalStrut(10)); // 上のコンポーネントとの間のスペース
        mainPanel.add(friendsButtonPanel);
        
        // 友達を追加フォーム
        JPanel addFriendPanel = new JPanel();
        addFriendPanel.setLayout(new BoxLayout(addFriendPanel, BoxLayout.Y_AXIS));
        
        JTextField friendIdField = new JTextField("", 15); // 初期テキストを空に設定
        friendIdField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30)); // 縦幅を30に設定
        JPanel friendIdPanel = new JPanel();
        friendIdPanel.setLayout(new BoxLayout(friendIdPanel, BoxLayout.X_AXIS));
        friendIdPanel.add(friendIdField);
        
        JButton addFriendButton = new JButton(ADD_FRIEND);
        addFriendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("友達を追加ボタンが押されました: " + friendIdField.getText());
            }
        });
        friendIdPanel.add(Box.createHorizontalStrut(10)); // テキストフィールドとボタンの間のスペース
        friendIdPanel.add(addFriendButton);
        
        addFriendPanel.add(friendIdPanel);
        mainPanel.add(Box.createVerticalStrut(10)); // 上のコンポーネントとの間のスペース
        mainPanel.add(addFriendPanel);
        
        // 予約履歴の表示
        JLabel historyLabel = new JLabel(HISTORY);
        historyLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
        mainPanel.add(Box.createVerticalStrut(20)); // 上のコンポーネントとの間のスペース
        mainPanel.add(historyLabel);
        
        // 予約履歴のプレースホルダー
        JPanel historyPanel = new JPanel();
        historyPanel.setLayout(new BoxLayout(historyPanel, BoxLayout.Y_AXIS));
        historyPanel.setPreferredSize(new Dimension(300, 200));
        historyPanel.setOpaque(true);
        
        // 予約履歴のラベルを追加（例として3つの予約を追加）
        reflectReservationHistory(historyPanel);
       /* historyPanel.add(new JLabel("予約2: 2024-06-02 12:00"));
        historyPanel.add(new JLabel("予約3: 2024-06-03 14:00"));  */
        
        mainPanel.add(Box.createVerticalStrut(10)); // 上のコンポーネントとの間のスペース
        mainPanel.add(historyPanel);
        
        // メインパネルをフレームに追加
        frame.add(mainPanel);

        // フレームを表示
        frame.setVisible(true);
    }

    
    private void reflectReservationHistory(JPanel historyPanel) {
    	//予約情報をひとつづつ取得する場合を想定
    	String str="なし";
    	int j=0;
    	do {
    		//予約情報を取得 
    		str=getReservationHistory();
    		historyPanel.add(new JLabel(str));
    		j++;
    	}while(j<5 && !(str.equals("なし")));
    	
    	
    }
    
    int i=0;
    
    String reservationHistory[]= {"予約1: 2024-06-01 10:00",
    		"予約2: 2024-06-02 10:00",
    		"予約3: 2024-06-03 10:00",
    		"なし"};
    
    private String getReservationHistory() {
    	return reservationHistory[i++];
    }
    
    public void actionPerfomed(ActionEvent e) {
    	switch(e.getActionCommand()) {
    	case FRIENDS_LIST:
    		
    		break;
    	case ADD_FRIEND:
    		break;
    	}
    }
}
