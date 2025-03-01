package com.digrazia.creational.builder;

public class House {
    private String roof;
    private String windows;

    public void setRoof(String roof) { this.roof = roof; }
    public void setWindows(String windows) { this.windows = windows; }

    @Override
    public String toString() {
        return "House [partA=" + roof + ", partB=" + windows + "]";
    }


    /**
     * Builder for creating House instances.
     */
    public static class HouseBuilder {

        private House house = new House();

        /**
         * Sets roof of the product.
         *
         * @param roof Value for roof
         * @return Builder instance
         */
        public HouseBuilder buildPartA(String roof) {
            house.setRoof(roof);
            return this;
        }

        /**
         * Sets windows of the product.
         *
         * @param windows Value for part window
         * @return Builder instance
         */
        public HouseBuilder buildPartB(String windows) {
            house.setWindows(windows);
            return this;
        }

        /**
         * Returns the final built Product.
         *
         * @return Product instance
         */
        public House build() {
            return house;
        }
    }
}
