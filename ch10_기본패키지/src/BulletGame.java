import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class BulletGame extends JPanel implements ActionListener, KeyListener {

    private static final int WIDTH = 500; // 게임 화면의 가로 크기
    private static final int HEIGHT = 500; // 게임 화면의 세로 크기
    private static final int PLAYER_WIDTH = 20; // 플레이어 크기
    private static final int PLAYER_HEIGHT = 20;
    private static final int BULLET_SIZE = 10; // 총알 크기
    private static final int PLAYER_SPEED = 5; // 플레이어 이동 속도
    private static final int BULLET_SPEED = 10; // 총알 이동 속도

    private int playerX = 250; // 플레이어 위치 초기화
    private int playerY = 450;
    private int bulletX; // 총알 위치
    private int bulletY;
    private boolean bulletVisible = false; // 총알 생성 여부

    public BulletGame() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT)); // 게임 화면 크기 설정
        setBackground(Color.BLACK); // 배경 색상 설정

        // 게임 시작을 위한 타이머 설정
        Timer timer = new Timer(20, this);
        timer.start();

        // 키보드 이벤트 리스너 등록
        addKeyListener(this);
        setFocusable(true);
    }

    // 게임 화면 그리기
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // 플레이어 그리기
        g.setColor(Color.WHITE);
        g.fillRect(playerX, playerY, PLAYER_WIDTH, PLAYER_HEIGHT);

        // 총알 그리기
        if (bulletVisible) {
            g.setColor(Color.RED);
            g.fillRect(bulletX, bulletY, BULLET_SIZE, BULLET_SIZE);
        }
    }

    // 총알 이동 처리
    public void moveBullet() {
        if (bulletVisible) {
            bulletY -= BULLET_SPEED; // 총알은 위로 이동
            if (bulletY < 0) { // 화면 밖으로 나가면 총알 삭제
                bulletVisible = false;
            }
        }
    }

    // 총알과 플레이어 충돌 체크
    public void checkCollision() {
        if (bulletVisible) {
            int dx = playerX + PLAYER_WIDTH / 2 - (bulletX + BULLET_SIZE / 2);
            int dy = playerY + PLAYER_HEIGHT / 2 - (bulletY + BULLET_SIZE / 2);
            int distance = (int) Math.sqrt(dx * dx + dy * dy); // 두 점 사이의 거리 계산
            if (distance < PLAYER_WIDTH / 2 + BULLET_SIZE / 2) { // 총알과 플레이어가 충돌하면
                bulletVisible = false; // 총알 삭제
                System.out.println("Game Over!"); // 게임 종료
                System.exit(0);
            }
        }
    }

    // 총알 이벤트 처리
    @Override
    public void actionPerformed(ActionEvent e) {
        moveBullet(); // 총알 이동
        checkCollision(); // 충돌 체크
        repaint(); // 게임 화면 다시 그리기
    }

    // 키보드 이벤트 처리
    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT: // 왼쪽 화살표를 누르면 플레이어 왼쪽으로 이동
                playerX -= PLAYER_SPEED;
                break;
            case KeyEvent.VK_RIGHT: // 오른쪽 화살표를 누르면 플레이어 오른쪽으로 이동
                playerX += PLAYER_SPEED;
                break;
            case KeyEvent.VK_SPACE: // 스페이스바를 누르면 총알 발사
                if (!bulletVisible) {
                    bulletX = playerX + PLAYER_WIDTH / 2 - BULLET_SIZE / 2; // 총알 위치 초기화
                    bulletY = playerY;
                    bulletVisible = true; // 총알 생성
                }
                break;
        }
        // 플레이어가 화면 밖으로 나가지 않도록 처리
        if (playerX < 0) {
            playerX = 0;
        }
        if (playerX > WIDTH - PLAYER_WIDTH) {
            playerX = WIDTH - PLAYER_WIDTH;
        }
        repaint(); // 게임 화면 다시 그리기
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bullet Game"); // 게임 창 생성
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new BulletGame()); // 게임 화면 추가
        frame.pack();
        frame.setLocationRelativeTo(null); // 화면 중앙에 위치
        frame.setVisible(true);
    }
}