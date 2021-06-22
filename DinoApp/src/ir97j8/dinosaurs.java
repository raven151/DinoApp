
package ir97j8;


public class dinosaurs {
    
    String name;
    String type;
    String description;
    Double length;
    Double height;
    Double weight;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public dinosaurs(String name, String type, String description, Double length, Double height, Double weight) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.length = length;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
    
    public static dinosaurs GenerateDino(String name, String type, String desc, Double length, Double height, Double weight){
        
        dinosaurs dino = new dinosaurs(name,type,desc,length,height,weight);
        return dino;
    }
    
    public static dinosaurs GenerateCarnivore(String name, String desc, Double length, Double height, Double weight){
        String carn = "Húsevő";
        dinosaurs dino = new dinosaurs(name,carn,desc,length,height,weight);
        return dino;
    }
    public static dinosaurs GenerateHerbivore(String name, String desc, Double length, Double height, Double weight){
        String herb = "Növényevő";
        dinosaurs dino = new dinosaurs(name,herb,desc,length,height,weight);
        return dino;
    }



    
    
    
    
}
