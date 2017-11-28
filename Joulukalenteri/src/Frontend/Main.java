package Frontend;

import Backend.*;

public class Main extends javax.swing.JFrame {

    private File file;
    private Music music;
    private Time time;

    private Luukku Luukku1;
    private Luukku Luukku2;
    private Luukku Luukku3;
    private Luukku Luukku4;
    private Luukku Luukku5;
    private Luukku Luukku6;
    private Luukku Luukku7;
    private Luukku Luukku8;
    private Luukku Luukku9;
    private Luukku Luukku10;
    private Luukku Luukku11;
    private Luukku Luukku12;
    private Luukku Luukku13;
    private Luukku Luukku14;
    private Luukku Luukku15;
    private Luukku Luukku16;
    private Luukku Luukku17;
    private Luukku Luukku18;
    private Luukku Luukku19;
    private Luukku Luukku20;
    private Luukku Luukku21;
    private Luukku Luukku22;
    private Luukku Luukku23;
    private Luukku Luukku24;

    public Main() {
        initComponents();
        music = new Music();

        Luukku1 = new Luukku(false, "Music/Cascada - Last Christmas.wav", true);
        Luukku2 = new Luukku(false, "Music/Juice Leskinen - Sika.wav", true);
        Luukku3 = new Luukku(false, "Music/Aamen.wav", true);
        Luukku4 = new Luukku(false, "", true);
        Luukku5 = new Luukku(false, "Music/10v100v.wav", true);
        Luukku6 = new Luukku(false, "Music/Maamme laulu.wav", true);
        Luukku7 = new Luukku(false, "", true);
        Luukku8 = new Luukku(false, "", true);
        Luukku9 = new Luukku(false, "Music/Taivas Lyö Tulta.wav", true);
        Luukku10 = new Luukku(false, "", true);
        Luukku11 = new Luukku(false, "", true);
        Luukku12 = new Luukku(false, "", true);
        Luukku13 = new Luukku(false, "Music/POKEMON-GO-SONG-by-MISHA-FOR-KIDS-ORIGINAL.wav", true);
        Luukku14 = new Luukku(false, "", true);
        Luukku15 = new Luukku(false, "Music/PetteriPunakuono.wav", true);
        Luukku16 = new Luukku(false, "Music/Vesa-Matti Hyvaa puuta.wav", true);
        Luukku17 = new Luukku(false, "Music/Arttu Wiskari - Mökkitie (VIDEO).wav", true);
        Luukku18 = new Luukku(false, "Music/Lordi - Hard Rock Halleluja.wav", true);
        Luukku19 = new Luukku(false, "Music/Älypää.wav", true);
        Luukku20 = new Luukku(false, "Music/Mining Diamonds.wav", true);
        Luukku21 = new Luukku(false, "Music/Kolme Yötä Jouluun.wav", true);
        Luukku22 = new Luukku(false, "", true);
        Luukku23 = new Luukku(false, "Music/Romi Packalen - Final Countdown.wav", true);
        Luukku24 = new Luukku(false, "Music/Joulupukki - Valkoparta.wav", true);

        file = new File(Luukku1, Luukku2, Luukku3, Luukku4, Luukku5, Luukku6,
                Luukku7, Luukku8, Luukku9, Luukku10, Luukku11, Luukku12,
                Luukku13, Luukku14, Luukku15, Luukku16, Luukku17, Luukku18,
                Luukku19, Luukku20, Luukku21, Luukku22, Luukku23, Luukku24);

        time = new Time(Luukku1, Luukku2, Luukku3, Luukku4, Luukku5, Luukku6,
                Luukku7, Luukku8, Luukku9, Luukku10, Luukku11, Luukku12,
                Luukku13, Luukku14, Luukku15, Luukku16, Luukku17, Luukku18,
                Luukku19, Luukku20, Luukku21, Luukku22, Luukku23, Luukku24);

        file.Luku();
        file.setLuukut();
        time.luukut();
        avatutLuukut();
    }

    //Luukun sisälle tulee music, File.lisaLuukut() + Kirjoitus(), luukku.setVisible(false);
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nro9 = new javax.swing.JLabel();
        nro22 = new javax.swing.JLabel();
        nro5 = new javax.swing.JLabel();
        nro12 = new javax.swing.JLabel();
        nro8 = new javax.swing.JLabel();
        nro7 = new javax.swing.JLabel();
        nro2 = new javax.swing.JLabel();
        nro19 = new javax.swing.JLabel();
        nro14 = new javax.swing.JLabel();
        nro3 = new javax.swing.JLabel();
        nro10 = new javax.swing.JLabel();
        nro4 = new javax.swing.JLabel();
        nro24 = new javax.swing.JLabel();
        nro6 = new javax.swing.JLabel();
        nro23 = new javax.swing.JLabel();
        nro20 = new javax.swing.JLabel();
        nro11 = new javax.swing.JLabel();
        nro15 = new javax.swing.JLabel();
        nro21 = new javax.swing.JLabel();
        nro18 = new javax.swing.JLabel();
        nro16 = new javax.swing.JLabel();
        nro17 = new javax.swing.JLabel();
        nro13 = new javax.swing.JLabel();
        nro1 = new javax.swing.JLabel();
        luukku12 = new javax.swing.JButton();
        luukku8 = new javax.swing.JButton();
        luukku17 = new javax.swing.JButton();
        luukku13 = new javax.swing.JButton();
        luukku9 = new javax.swing.JButton();
        luukku7 = new javax.swing.JButton();
        luukku2 = new javax.swing.JButton();
        luukku22 = new javax.swing.JButton();
        luukku19 = new javax.swing.JButton();
        luukku5 = new javax.swing.JButton();
        luukku14 = new javax.swing.JButton();
        luukku3 = new javax.swing.JButton();
        luukku10 = new javax.swing.JButton();
        luukku4 = new javax.swing.JButton();
        luukku24 = new javax.swing.JButton();
        Luukku17_back14 = new javax.swing.JLabel();
        luukku6 = new javax.swing.JButton();
        luukku23 = new javax.swing.JButton();
        luukku20 = new javax.swing.JButton();
        luukku11 = new javax.swing.JButton();
        luukku15 = new javax.swing.JButton();
        luukku21 = new javax.swing.JButton();
        luukku18 = new javax.swing.JButton();
        luukku16 = new javax.swing.JButton();
        luukku1 = new javax.swing.JButton();
        Luukku13_back = new javax.swing.JLabel();
        Luukku9_back = new javax.swing.JLabel();
        Luukku22_back = new javax.swing.JLabel();
        Luukku5_back = new javax.swing.JLabel();
        Luukku17_back5 = new javax.swing.JLabel();
        Luukku17_back6 = new javax.swing.JLabel();
        Luukku17_back7 = new javax.swing.JLabel();
        Luukku17_back8 = new javax.swing.JLabel();
        Luukku17_back9 = new javax.swing.JLabel();
        Luukku17_back10 = new javax.swing.JLabel();
        Luukku17_back11 = new javax.swing.JLabel();
        Luukku17_back12 = new javax.swing.JLabel();
        Luukku17_back13 = new javax.swing.JLabel();
        Luukku17_back15 = new javax.swing.JLabel();
        Luukku17_back16 = new javax.swing.JLabel();
        Luukku17_back17 = new javax.swing.JLabel();
        Luukku17_back18 = new javax.swing.JLabel();
        Luukku17_back19 = new javax.swing.JLabel();
        Luukku17_back20 = new javax.swing.JLabel();
        Luukku17_back21 = new javax.swing.JLabel();
        Luukku17_back22 = new javax.swing.JLabel();
        Luukku17_back23 = new javax.swing.JLabel();
        Luukku17_back = new javax.swing.JLabel();
        Luukku1_back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Joulukalenteri");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nro9.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro9.setForeground(new java.awt.Color(0, 0, 0));
        nro9.setText("9");
        getContentPane().add(nro9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));

        nro22.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro22.setForeground(new java.awt.Color(0, 0, 0));
        nro22.setText("22");
        getContentPane().add(nro22, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, -1, -1));

        nro5.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro5.setForeground(new java.awt.Color(0, 0, 0));
        nro5.setText("5");
        getContentPane().add(nro5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, -1, -1));

        nro12.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro12.setForeground(new java.awt.Color(0, 0, 0));
        nro12.setText("12");
        getContentPane().add(nro12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        nro8.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro8.setForeground(new java.awt.Color(0, 0, 0));
        nro8.setText("8");
        getContentPane().add(nro8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        nro7.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro7.setForeground(new java.awt.Color(0, 0, 0));
        nro7.setText("7");
        getContentPane().add(nro7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 40, -1));

        nro2.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro2.setForeground(new java.awt.Color(0, 0, 0));
        nro2.setText("2");
        getContentPane().add(nro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, -1, -1));

        nro19.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro19.setForeground(new java.awt.Color(0, 0, 0));
        nro19.setText("19");
        getContentPane().add(nro19, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 200, -1, -1));

        nro14.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro14.setForeground(new java.awt.Color(0, 0, 0));
        nro14.setText("14");
        getContentPane().add(nro14, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 200, -1, -1));

        nro3.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro3.setForeground(new java.awt.Color(0, 0, 0));
        nro3.setText("3");
        getContentPane().add(nro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        nro10.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro10.setForeground(new java.awt.Color(0, 0, 0));
        nro10.setText("10");
        getContentPane().add(nro10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, -1, -1));

        nro4.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro4.setForeground(new java.awt.Color(0, 0, 0));
        nro4.setText("4");
        getContentPane().add(nro4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        nro24.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro24.setForeground(new java.awt.Color(0, 0, 0));
        nro24.setText("24");
        getContentPane().add(nro24, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));

        nro6.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro6.setForeground(new java.awt.Color(0, 0, 0));
        nro6.setText("6");
        getContentPane().add(nro6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 350, -1, -1));

        nro23.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro23.setForeground(new java.awt.Color(0, 0, 0));
        nro23.setText("23");
        getContentPane().add(nro23, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, -1, -1));

        nro20.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro20.setForeground(new java.awt.Color(0, 0, 0));
        nro20.setText("20");
        getContentPane().add(nro20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        nro11.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro11.setForeground(new java.awt.Color(0, 0, 0));
        nro11.setText("11");
        getContentPane().add(nro11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, -1, -1));

        nro15.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro15.setForeground(new java.awt.Color(0, 0, 0));
        nro15.setText("15");
        getContentPane().add(nro15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 500, -1, -1));

        nro21.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro21.setForeground(new java.awt.Color(0, 0, 0));
        nro21.setText("21");
        getContentPane().add(nro21, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, -1, -1));

        nro18.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro18.setForeground(new java.awt.Color(0, 0, 0));
        nro18.setText("18");
        getContentPane().add(nro18, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 500, -1, -1));

        nro16.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro16.setForeground(new java.awt.Color(0, 0, 0));
        nro16.setText("16");
        getContentPane().add(nro16, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 500, -1, -1));

        nro17.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro17.setForeground(new java.awt.Color(0, 0, 0));
        nro17.setText("17");
        getContentPane().add(nro17, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        nro13.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro13.setForeground(new java.awt.Color(0, 0, 0));
        nro13.setText("13");
        getContentPane().add(nro13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        nro1.setFont(new java.awt.Font("Dialog", 0, 70)); // NOI18N
        nro1.setForeground(new java.awt.Color(0, 0, 0));
        nro1.setText("1");
        getContentPane().add(nro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        luukku12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku12.png"))); // NOI18N
        luukku12.setBorderPainted(false);
        luukku12.setContentAreaFilled(false);
        luukku12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku12ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 130, 130));

        luukku8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku8.png"))); // NOI18N
        luukku8.setBorderPainted(false);
        luukku8.setContentAreaFilled(false);
        luukku8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku8ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 130, 130));

        luukku17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku17.png"))); // NOI18N
        luukku17.setBorderPainted(false);
        luukku17.setContentAreaFilled(false);
        luukku17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku17ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 130, 130));

        luukku13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku13.png"))); // NOI18N
        luukku13.setBorderPainted(false);
        luukku13.setOpaque(false);
        luukku13.setSelected(true);
        luukku13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku13ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 130, 130));

        luukku9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku9.png"))); // NOI18N
        luukku9.setBorderPainted(false);
        luukku9.setContentAreaFilled(false);
        luukku9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku9ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 130, 130));

        luukku7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku7.png"))); // NOI18N
        luukku7.setBorderPainted(false);
        luukku7.setContentAreaFilled(false);
        luukku7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku7ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 180, 130, 130));

        luukku2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku2.png"))); // NOI18N
        luukku2.setBorderPainted(false);
        luukku2.setContentAreaFilled(false);
        luukku2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku2ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 130, 130));

        luukku22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku22.png"))); // NOI18N
        luukku22.setBorderPainted(false);
        luukku22.setContentAreaFilled(false);
        luukku22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku22ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku22, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 130, 130));

        luukku19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku19.png"))); // NOI18N
        luukku19.setBorderPainted(false);
        luukku19.setContentAreaFilled(false);
        luukku19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku19ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku19, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 130, 130));

        luukku5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku5.png"))); // NOI18N
        luukku5.setBorderPainted(false);
        luukku5.setContentAreaFilled(false);
        luukku5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku5ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 30, 130, 130));

        luukku14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku14.png"))); // NOI18N
        luukku14.setBorderPainted(false);
        luukku14.setContentAreaFilled(false);
        luukku14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku14ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku14, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 180, 130, 130));

        luukku3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku3.png"))); // NOI18N
        luukku3.setBorderPainted(false);
        luukku3.setContentAreaFilled(false);
        luukku3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku3ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 130, 130));

        luukku10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku10.png"))); // NOI18N
        luukku10.setBorderPainted(false);
        luukku10.setContentAreaFilled(false);
        luukku10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku10ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 130, 130));

        luukku4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku4.png"))); // NOI18N
        luukku4.setBorderPainted(false);
        luukku4.setContentAreaFilled(false);
        luukku4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku4ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 130, 130));

        luukku24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku24.png"))); // NOI18N
        luukku24.setBorderPainted(false);
        luukku24.setContentAreaFilled(false);
        luukku24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku24ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku24, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 130, 130));

        Luukku17_back14.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku17_back14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku24_Back.png"))); // NOI18N
        getContentPane().add(Luukku17_back14, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 330, 130, 130));

        luukku6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku6.png"))); // NOI18N
        luukku6.setBorderPainted(false);
        luukku6.setContentAreaFilled(false);
        luukku6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku6ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 130, 130));

        luukku23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku23.png"))); // NOI18N
        luukku23.setBorderPainted(false);
        luukku23.setContentAreaFilled(false);
        luukku23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku23ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku23, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 330, 130, 130));

        luukku20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku20.png"))); // NOI18N
        luukku20.setBorderPainted(false);
        luukku20.setContentAreaFilled(false);
        luukku20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku20ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 130, 130));

        luukku11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku11.png"))); // NOI18N
        luukku11.setBorderPainted(false);
        luukku11.setContentAreaFilled(false);
        luukku11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku11ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 130, 130));

        luukku15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku15.png"))); // NOI18N
        luukku15.setBorderPainted(false);
        luukku15.setContentAreaFilled(false);
        luukku15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku15ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, 130, 130));

        luukku21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku21.png"))); // NOI18N
        luukku21.setBorderPainted(false);
        luukku21.setContentAreaFilled(false);
        luukku21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku21ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku21, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 479, 130, 130));

        luukku18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku18.png"))); // NOI18N
        luukku18.setBorderPainted(false);
        luukku18.setContentAreaFilled(false);
        luukku18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku18ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku18, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 480, 130, 130));

        luukku16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku16.png"))); // NOI18N
        luukku16.setBorderPainted(false);
        luukku16.setContentAreaFilled(false);
        luukku16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku16ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku16, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 480, 130, 130));

        luukku1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku1.png"))); // NOI18N
        luukku1.setBorderPainted(false);
        luukku1.setContentAreaFilled(false);
        luukku1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                luukku1ActionPerformed(evt);
            }
        });
        getContentPane().add(luukku1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 130, 130));

        Luukku13_back.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku13_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku13_Back.png"))); // NOI18N
        getContentPane().add(Luukku13_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 30, 130, 130));

        Luukku9_back.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku9_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku9_Back.png"))); // NOI18N
        getContentPane().add(Luukku9_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 30, 130, 130));

        Luukku22_back.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku22_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku22_Back.png"))); // NOI18N
        getContentPane().add(Luukku22_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 30, 130, 130));

        Luukku5_back.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku5_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku5_Back.png"))); // NOI18N
        getContentPane().add(Luukku5_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 30, 130, 130));

        Luukku17_back5.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku17_back5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku12_Back.png"))); // NOI18N
        getContentPane().add(Luukku17_back5, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 180, 130, 130));

        Luukku17_back6.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku17_back6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku8_Back.png"))); // NOI18N
        getContentPane().add(Luukku17_back6, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 180, 130, 130));

        Luukku17_back7.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku17_back7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku7_Back.png"))); // NOI18N
        getContentPane().add(Luukku17_back7, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 180, 130, 130));

        Luukku17_back8.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku17_back8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku2_Back.png"))); // NOI18N
        getContentPane().add(Luukku17_back8, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 180, 130, 130));

        Luukku17_back9.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku17_back9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku19_Back.png"))); // NOI18N
        getContentPane().add(Luukku17_back9, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 180, 130, 130));

        Luukku17_back10.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku17_back10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku14_Back.png"))); // NOI18N
        getContentPane().add(Luukku17_back10, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 180, 130, 130));

        Luukku17_back11.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku17_back11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku3_Back.png"))); // NOI18N
        getContentPane().add(Luukku17_back11, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 330, 130, 130));

        Luukku17_back12.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku17_back12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku10_Back.png"))); // NOI18N
        getContentPane().add(Luukku17_back12, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 330, 130, 130));

        Luukku17_back13.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku17_back13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku4_Back.png"))); // NOI18N
        getContentPane().add(Luukku17_back13, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 330, 130, 130));

        Luukku17_back15.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku17_back15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku6_Back.png"))); // NOI18N
        getContentPane().add(Luukku17_back15, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 330, 130, 130));

        Luukku17_back16.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku17_back16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku23_Back.png"))); // NOI18N
        getContentPane().add(Luukku17_back16, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 330, 130, 130));

        Luukku17_back17.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku17_back17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku20_Back.png"))); // NOI18N
        getContentPane().add(Luukku17_back17, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 480, 130, 130));

        Luukku17_back18.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku17_back18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku11_back.png"))); // NOI18N
        getContentPane().add(Luukku17_back18, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 480, 130, 130));

        Luukku17_back19.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku17_back19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku15_back.png"))); // NOI18N
        getContentPane().add(Luukku17_back19, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 480, 130, 130));

        Luukku17_back20.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku17_back20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku21_back.png"))); // NOI18N
        getContentPane().add(Luukku17_back20, new org.netbeans.lib.awtextra.AbsoluteConstraints(482, 479, 130, 130));

        Luukku17_back21.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku17_back21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku18_back.png"))); // NOI18N
        getContentPane().add(Luukku17_back21, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 480, 130, 130));

        Luukku17_back22.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku17_back22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku16_back.png"))); // NOI18N
        getContentPane().add(Luukku17_back22, new org.netbeans.lib.awtextra.AbsoluteConstraints(782, 480, 130, 130));

        Luukku17_back23.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku17_back23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku17_back.png"))); // NOI18N
        getContentPane().add(Luukku17_back23, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 30, 130, 130));

        Luukku17_back.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku17_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku17_back.png"))); // NOI18N
        getContentPane().add(Luukku17_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 30, 130, 130));

        Luukku1_back.setFont(new java.awt.Font("Harlow Solid Italic", 1, 20)); // NOI18N
        Luukku1_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Luukku1_back.png"))); // NOI18N
        getContentPane().add(Luukku1_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 30, 130, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Background.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void luukku13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku13ActionPerformed
        if (Luukku13.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku13.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku13.setVisible(false);
            nro13.setVisible(false);
        }
    }//GEN-LAST:event_luukku13ActionPerformed

    private void luukku1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku1ActionPerformed
        if (Luukku1.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku1.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku1.setVisible(false);
            nro1.setVisible(false);
        }
    }//GEN-LAST:event_luukku1ActionPerformed

    private void luukku17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku17ActionPerformed
        if (Luukku17.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku17.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku17.setVisible(false);
            nro17.setVisible(false);

        }
    }//GEN-LAST:event_luukku17ActionPerformed

    private void luukku2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku2ActionPerformed
        if (Luukku2.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku2.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku2.setVisible(false);
            nro2.setVisible(false);
        }
    }//GEN-LAST:event_luukku2ActionPerformed

    private void luukku22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku22ActionPerformed
        if (Luukku22.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku22.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku22.setVisible(false);
            nro22.setVisible(false);
        }
    }//GEN-LAST:event_luukku22ActionPerformed

    private void luukku6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku6ActionPerformed
        if (Luukku6.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku6.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku6.setVisible(false);
            nro6.setVisible(false);
        }
    }//GEN-LAST:event_luukku6ActionPerformed

    private void luukku9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku9ActionPerformed
        if (Luukku9.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku9.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku9.setVisible(false);
            nro9.setVisible(false);
        }
    }//GEN-LAST:event_luukku9ActionPerformed

    private void luukku5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku5ActionPerformed
        if (Luukku5.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku5.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku5.setVisible(false);
            nro5.setVisible(false);
        }
    }//GEN-LAST:event_luukku5ActionPerformed

    private void luukku16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku16ActionPerformed
        if (Luukku16.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku16.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku16.setVisible(false);
            nro16.setVisible(false);
        }
    }//GEN-LAST:event_luukku16ActionPerformed

    private void luukku24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku24ActionPerformed
        if (Luukku24.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku24.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku24.setVisible(false);
            nro24.setVisible(false);
        }
    }//GEN-LAST:event_luukku24ActionPerformed

    private void luukku23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku23ActionPerformed
        if (Luukku23.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku23.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku23.setVisible(false);
            nro23.setVisible(false);
        }
    }//GEN-LAST:event_luukku23ActionPerformed

    private void luukku21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku21ActionPerformed
        if (Luukku21.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku21.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku21.setVisible(false);
            nro21.setVisible(false);
        }
    }//GEN-LAST:event_luukku21ActionPerformed

    private void luukku20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku20ActionPerformed
        if (Luukku20.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku20.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku20.setVisible(false);
            nro20.setVisible(false);
        }
    }//GEN-LAST:event_luukku20ActionPerformed

    private void luukku12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku12ActionPerformed
        if (Luukku12.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku12.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku12.setVisible(false);
            nro12.setVisible(false);
        }
    }//GEN-LAST:event_luukku12ActionPerformed

    private void luukku3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku3ActionPerformed
        if (Luukku3.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku3.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku3.setVisible(false);
            nro3.setVisible(false);
        }
    }//GEN-LAST:event_luukku3ActionPerformed

    private void luukku4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku4ActionPerformed
        if (Luukku4.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku4.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku4.setVisible(false);
            nro4.setVisible(false);
        }
    }//GEN-LAST:event_luukku4ActionPerformed

    private void luukku7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku7ActionPerformed
        if (Luukku7.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku7.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku7.setVisible(false);
            nro7.setVisible(false);
        }
    }//GEN-LAST:event_luukku7ActionPerformed

    private void luukku8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku8ActionPerformed
        if (Luukku8.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku8.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku8.setVisible(false);
            nro8.setVisible(false);
        }
    }//GEN-LAST:event_luukku8ActionPerformed

    private void luukku10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku10ActionPerformed
        if (Luukku10.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku10.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku10.setVisible(false);
            nro10.setVisible(false);
        }
    }//GEN-LAST:event_luukku10ActionPerformed

    private void luukku11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku11ActionPerformed
        if (Luukku11.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku11.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku11.setVisible(false);
            nro11.setVisible(false);
        }
    }//GEN-LAST:event_luukku11ActionPerformed

    private void luukku14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku14ActionPerformed
        if (Luukku14.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku14.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku14.setVisible(false);
            nro14.setVisible(false);
        }
    }//GEN-LAST:event_luukku14ActionPerformed

    private void luukku15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku15ActionPerformed
        if (Luukku15.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku15.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku15.setVisible(false);
            nro15.setVisible(false);
        }
    }//GEN-LAST:event_luukku15ActionPerformed

    private void luukku19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku19ActionPerformed
        if (Luukku19.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku19.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku19.setVisible(false);
            nro19.setVisible(false);
        }
    }//GEN-LAST:event_luukku19ActionPerformed

    private void luukku18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_luukku18ActionPerformed
        if (Luukku18.getAvattavissa()) {
            music.stopMusic();
            music.audio(Luukku18.getMusic());
            file.lisaaLuukut();
            file.Kirjoitus();
            luukku18.setVisible(false);
            nro18.setVisible(false);
        }
    }//GEN-LAST:event_luukku18ActionPerformed

    private void avatutLuukut() {
        luukku1.setVisible(Luukku1.getAvattu());
        luukku2.setVisible(Luukku2.getAvattu());
        luukku3.setVisible(Luukku3.getAvattu());
        luukku4.setVisible(Luukku4.getAvattu());
        luukku5.setVisible(Luukku5.getAvattu());
        luukku6.setVisible(Luukku6.getAvattu());
        luukku7.setVisible(Luukku7.getAvattu());
        luukku8.setVisible(Luukku8.getAvattu());
        luukku9.setVisible(Luukku9.getAvattu());
        luukku10.setVisible(Luukku10.getAvattu());
        luukku11.setVisible(Luukku11.getAvattu());
        luukku12.setVisible(Luukku12.getAvattu());
        luukku13.setVisible(Luukku13.getAvattu());
        luukku14.setVisible(Luukku14.getAvattu());
        luukku15.setVisible(Luukku15.getAvattu());
        luukku16.setVisible(Luukku16.getAvattu());
        luukku17.setVisible(Luukku17.getAvattu());
        luukku18.setVisible(Luukku18.getAvattu());
        luukku19.setVisible(Luukku19.getAvattu());
        luukku20.setVisible(Luukku20.getAvattu());
        luukku21.setVisible(Luukku21.getAvattu());
        luukku22.setVisible(Luukku22.getAvattu());
        luukku23.setVisible(Luukku23.getAvattu());
        luukku24.setVisible(Luukku24.getAvattu());
        nro1.setVisible(Luukku1.getAvattu());
        nro2.setVisible(Luukku2.getAvattu());
        nro3.setVisible(Luukku3.getAvattu());
        nro4.setVisible(Luukku4.getAvattu());
        nro5.setVisible(Luukku5.getAvattu());
        nro6.setVisible(Luukku6.getAvattu());
        nro7.setVisible(Luukku7.getAvattu());
        nro8.setVisible(Luukku8.getAvattu());
        nro9.setVisible(Luukku9.getAvattu());
        nro10.setVisible(Luukku10.getAvattu());
        nro11.setVisible(Luukku11.getAvattu());
        nro12.setVisible(Luukku12.getAvattu());
        nro13.setVisible(Luukku13.getAvattu());
        nro14.setVisible(Luukku14.getAvattu());
        nro15.setVisible(Luukku15.getAvattu());
        nro16.setVisible(Luukku16.getAvattu());
        nro17.setVisible(Luukku17.getAvattu());
        nro18.setVisible(Luukku18.getAvattu());
        nro19.setVisible(Luukku19.getAvattu());
        nro20.setVisible(Luukku20.getAvattu());
        nro21.setVisible(Luukku21.getAvattu());
        nro22.setVisible(Luukku22.getAvattu());
        nro23.setVisible(Luukku23.getAvattu());
        nro24.setVisible(Luukku24.getAvattu());

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Luukku13_back;
    private javax.swing.JLabel Luukku17_back;
    private javax.swing.JLabel Luukku17_back10;
    private javax.swing.JLabel Luukku17_back11;
    private javax.swing.JLabel Luukku17_back12;
    private javax.swing.JLabel Luukku17_back13;
    private javax.swing.JLabel Luukku17_back14;
    private javax.swing.JLabel Luukku17_back15;
    private javax.swing.JLabel Luukku17_back16;
    private javax.swing.JLabel Luukku17_back17;
    private javax.swing.JLabel Luukku17_back18;
    private javax.swing.JLabel Luukku17_back19;
    private javax.swing.JLabel Luukku17_back20;
    private javax.swing.JLabel Luukku17_back21;
    private javax.swing.JLabel Luukku17_back22;
    private javax.swing.JLabel Luukku17_back23;
    private javax.swing.JLabel Luukku17_back5;
    private javax.swing.JLabel Luukku17_back6;
    private javax.swing.JLabel Luukku17_back7;
    private javax.swing.JLabel Luukku17_back8;
    private javax.swing.JLabel Luukku17_back9;
    private javax.swing.JLabel Luukku1_back;
    private javax.swing.JLabel Luukku22_back;
    private javax.swing.JLabel Luukku5_back;
    private javax.swing.JLabel Luukku9_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton luukku1;
    private javax.swing.JButton luukku10;
    private javax.swing.JButton luukku11;
    private javax.swing.JButton luukku12;
    private javax.swing.JButton luukku13;
    private javax.swing.JButton luukku14;
    private javax.swing.JButton luukku15;
    private javax.swing.JButton luukku16;
    private javax.swing.JButton luukku17;
    private javax.swing.JButton luukku18;
    private javax.swing.JButton luukku19;
    private javax.swing.JButton luukku2;
    private javax.swing.JButton luukku20;
    private javax.swing.JButton luukku21;
    private javax.swing.JButton luukku22;
    private javax.swing.JButton luukku23;
    private javax.swing.JButton luukku24;
    private javax.swing.JButton luukku3;
    private javax.swing.JButton luukku4;
    private javax.swing.JButton luukku5;
    private javax.swing.JButton luukku6;
    private javax.swing.JButton luukku7;
    private javax.swing.JButton luukku8;
    private javax.swing.JButton luukku9;
    private javax.swing.JLabel nro1;
    private javax.swing.JLabel nro10;
    private javax.swing.JLabel nro11;
    private javax.swing.JLabel nro12;
    private javax.swing.JLabel nro13;
    private javax.swing.JLabel nro14;
    private javax.swing.JLabel nro15;
    private javax.swing.JLabel nro16;
    private javax.swing.JLabel nro17;
    private javax.swing.JLabel nro18;
    private javax.swing.JLabel nro19;
    private javax.swing.JLabel nro2;
    private javax.swing.JLabel nro20;
    private javax.swing.JLabel nro21;
    private javax.swing.JLabel nro22;
    private javax.swing.JLabel nro23;
    private javax.swing.JLabel nro24;
    private javax.swing.JLabel nro3;
    private javax.swing.JLabel nro4;
    private javax.swing.JLabel nro5;
    private javax.swing.JLabel nro6;
    private javax.swing.JLabel nro7;
    private javax.swing.JLabel nro8;
    private javax.swing.JLabel nro9;
    // End of variables declaration//GEN-END:variables
}
