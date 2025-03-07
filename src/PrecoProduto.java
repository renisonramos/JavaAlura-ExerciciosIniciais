public class PrecoProduto {
    public static void main(String[] args) {
        double precoProduto = 97.90;
        int quantidade = 47;
        double valorTotal = precoProduto * quantidade;
        String mensagem = ("""
                O preço do produto é %.2f
                Foram vendidas %d unidades
                Totalizando R$%f em vendas.
                """.formatted(precoProduto, quantidade, valorTotal));
        System.out.println(mensagem);
    }
}
