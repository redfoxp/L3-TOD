import java.util.*;

public class Compte {
	private int solde;
	private String NomCompte;
	

	  public Compte(int entry)
	  {
	      this.NomCompte = "Compte";
	      this.solde = entry;
	  }

	public void virement(int entry)
	{
		

	}

	public int getSolde()
	{
	    return  this.solde;
	}

	public void affSolde()
	{
	  System.out.println(this.NomCompte+ " : "  + this.getSolde());
	}

}
