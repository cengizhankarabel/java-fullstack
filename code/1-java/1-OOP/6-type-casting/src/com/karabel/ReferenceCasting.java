package com.karabel;


interface USB{
    void read();
    void write();
}

class Mobile implements USB {

    @Override
    public void read() {
        System.out.println("Mobile-read()");
    }

    @Override
    public void write() {
        System.out.println("Mobile-write()");

    }
}

class Camera implements USB {

    @Override
    public void read() {
        System.out.println("Camera-read()");
    }

    @Override
    public void write() {
        System.out.println("Camera-write()");
    }
    public void takePicture(){
        System.out.println("take picture");
    }
}

class Macbook{
    // Open for Extension , Closed for Modification => dynamic polymorphism
    public void connectExternalDevice(USB usb){
        usb.read();
        usb.write();
        // down casting
        if(usb instanceof Camera){
            Camera camera=(Camera) usb;
            camera.takePicture();
        }
    }
}

public class ReferenceCasting {
    public static void main(String[] args) {

        Mobile mobile=new Mobile();
        Camera camera=new Camera();

        Macbook macbook = new Macbook();
        macbook.connectExternalDevice(mobile); // up-casting
        macbook.connectExternalDevice(camera);




    }
}
