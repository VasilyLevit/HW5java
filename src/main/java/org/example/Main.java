package org.example;

// Обход бинарного дерева рекурсивно в глубину

public class Main {
    public static void main(String[] args) {
        // формируем дерево
        Node tree = new Node(1,
                        new Node(2,
                            new Node(4,
                                new Node(7), new Node(9)),
                                null),
                        new Node(3,
                            new Node(5),
                                new Node(6, new Node(11), new Node(20))));
    }
    
    /**
     * предстваления узлов бинарного дерева содержащиз целые числа
     * value - значение узла
     * left - левый потомок
     * right - правый потомок
     */
    static class Node {
        int value;
        Node left;
        Node right;
        public Node(int value, Node left, Node right) {  // конструктор для узлов
            this.value = value;
            this.left = left;
            this.right = right;
            System.out.println("ValueNode: " + value); // проверка обхода (в обратном порядке) можно сделать лист
        }
        public Node(int value) { // конструктор для листов (узлы не имеющих потомков) - перегрузка
            this.value = value;
            System.out.println("ValueNode: " + value); // проверка обхода (в обратном порядке)
        }
    }
}