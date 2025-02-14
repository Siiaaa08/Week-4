package queueinterface.circularbuffersimulation;

public class Buffer {
        private int rare,front,capacity,size;

        private int[] buffer;

        public Buffer(int capacity){
            this.capacity=capacity;
            buffer=new int[capacity];
            this.rare=-1;
            this.front=0;
            this.size=0;
        }
        public void insert(int value){
            rare=(rare+1)%capacity;
            buffer[rare]=value;
            if(size<capacity){
                size++;
            }
            else {
                front=(front+1)%capacity;
            }

        }
        public void display(){
            System.out.print("Buffer : [");
            for(int i=0;i<size;i++){
                System.out.print(buffer[(front + i) % capacity] + (i < size - 1 ? ", " : ""));
            }
            System.out.println("]");
        }
        public int peek(){
            if(size==0){
                System.out.println("Stack is Empty");
                return -1;
            }
            return size;
        }
    }


