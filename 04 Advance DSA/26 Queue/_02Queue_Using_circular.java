
public class _02Queue_Using_circular {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // ADD : value ko add kr do
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            // when add 1st element
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove : value ko hata doo
        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int result = arr[front];
            if (rear == front) {
                return rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        // Peek - uper se dekh rhe hn
        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek()); // circular Queue is printed
            q.remove(); // 1,2,3,4,5
        }
    }
}
