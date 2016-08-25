package net.ethanpark.flight.contract;

/**
 * Created by baiyp on 2016/8/25.
 */
public class ProductSortType {
   private ProductSortingType sortingType;
   private SortingDirectionType directionType;

   public ProductSortingType getSortingType() {
      return sortingType;
   }

   public void setSortingType(ProductSortingType sortingType) {
      this.sortingType = sortingType;
   }

   public SortingDirectionType getDirectionType() {
      return directionType;
   }

   public void setDirectionType(SortingDirectionType directionType) {
      this.directionType = directionType;
   }
}
