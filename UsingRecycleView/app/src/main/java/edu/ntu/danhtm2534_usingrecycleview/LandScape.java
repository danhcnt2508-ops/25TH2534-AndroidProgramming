package edu.ntu.danhtm2534_usingrecycleview;

public class LandScape {
    String landIamgeFileName;
    String landCation;

    public LandScape(String landIamgeFileName, String landCation) {
        this.landIamgeFileName = landIamgeFileName;
        this.landCation = landCation;
    }

    public String getLandIamgeFileName() {
        return landIamgeFileName;
    }

    public void setLandIamgeFileName(String landIamgeFileName) {
        this.landIamgeFileName = landIamgeFileName;
    }

    public String getLandCation() {
        return landCation;
    }

    public void setLandCation(String landCation) {
        this.landCation = landCation;
    }
}
