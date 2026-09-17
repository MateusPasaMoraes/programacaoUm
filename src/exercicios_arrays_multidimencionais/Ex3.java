package exercicios_arrays_multidimencionais;

public class Ex3 {
    public static void main(String[] args) {
        int[][] estoque = {
            {10, 8, 9, 8},
            {12, 11, 10, 9},
            {7, 6, 8, 7}
        };

        int estoqueTotal = 0;
        int maiorEstoque = 0;
        int produtoMaior = 0;

        for (int i = 0; i < estoque.length; i++) {
            int totalProduto = 0;

            for (int j = 0; j < estoque[i].length; j++) {
                totalProduto += estoque[i][j];
            }

            estoqueTotal += totalProduto;

            if (totalProduto > maiorEstoque) {
                maiorEstoque = totalProduto;
                produtoMaior = i + 1;
            }

            System.out.println("Produto " + (i + 1) + ": " + totalProduto + " unidades");
        }

        System.out.println("Estoque total: " + estoqueTotal + " unidades");
        System.out.println("Maior estoque acumulado: Produto " + produtoMaior);
    }
}
