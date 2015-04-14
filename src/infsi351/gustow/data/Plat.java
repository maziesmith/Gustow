package infsi351.gustow.data;




public class Plat {
	private long id;
	private String nom;
	private double prix;
	//private TypePlats type;
	private String pathImage;
	private String description;
	
	public Plat() {
		
	}
	
	public Plat(String nom, double prix, String pathImage, String description) {
		super();
		//this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.pathImage = pathImage;
		this.description = description;
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
/*
	public TypePlats getType() {
		return type;
	}
	public void setType(TypePlats type) {
		this.type = type;
	}*/
	public String getPathImage() {
		return pathImage;
	}
	public void setPathImage(String pathImage) {
		this.pathImage = pathImage;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public String toString(){
		return nom + " à " + prix + " euro ";
	}
	
	
	
}
