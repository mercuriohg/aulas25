```java
new javax.swing.JDesktopPane(){
 private Image image;
    {
try{
image = imageID.read(getClass().getResource("/img/uno-henrique.jpeg"));
     }
catch (Exception e){
    e.printStackTrace();
      }

  }
@Override
   protected void paintComponent(Graphics g){
    super.paintComponent(g);
    g.drawImage(image,0,0, getWidth(), getHeight(), this);
     }
  }
```
