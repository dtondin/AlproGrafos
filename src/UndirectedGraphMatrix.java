import java.awt.List;
import java.util.ArrayList;


public class UndirectedGraphMatrix implements UndirectedGraph {
	
	private boolean[][] matrix;
	private List<String> names;

	@Override
	public void addVertice(String vertice) {
		// TODO armazena o vertice em names, se ainda nao existir

	}

	@Override
	/**
	 * add o arco
	 */
	public void addEdge(String strOrig, String strDest) {
		// TODO obter posicao do strOrig
		// TODO obter posicao do strOrig
		// TODO matr[pos(strOrig)][pos(strDest)] = true;
		// TODO matr[pos(strDest)][pos(strOrig)] = true;

	}

	@Override
	/**
	 * obter o grau
	 */
	public int getDegree(String vertice) {
		// TODO Obter posicao do vertice
		// TODO contar quantas saidas tem o vertice na matrix
		// TODO retornar o total
		return 0;
	}

	@Override
	public ArrayList<String> getAllAdjacents(String vertice) {
		// TODO Auto-generated method stub
		return null;
	}

}
