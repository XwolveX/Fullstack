package dinhlam2901.sunilies.modules.product.entity;

public class Product {
    private String id;
    private String handle;
    private String name;
    private Double price;
    private Double comparePrice;
    private String imageUrl;
    private String category;
    private String collection;
    private boolean active;

    public Product(String id, String handle,String name, Double price, Double comparePrice, String imageUrl, String category, String collection) {
        this.id = id;
        this.handle =  handle;
        this.name = name;
        this.price = price;
        this.comparePrice = comparePrice;
        this.imageUrl = imageUrl;
        this.category = category;
        this.collection = collection;
        this.active = true;
    }
    public String getId() {
        return id;
    }

    public boolean isActive() {
        return active;
    }

    public String getHandle() {
        return handle;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
    public Double getComparePrice() {
        return comparePrice;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public String getCategory() {
        return category;
    }
    public String getCollection() {
        return collection;
    }
    public int getDiscountPercent() {
        if(price == null || comparePrice == null || comparePrice <=0) {
            return 0;
        }
        return (int) Math.round((1 - price / comparePrice) * 100);
    }

}
