package net.ethanpark.flight.contract;

/**
 * Created by baiyp on 2016/8/25.
 */
public class ResultControlType {
   private int maxResultCount;
   private ProductSortType sortInstruction;
   private int transferType;

   public int getMaxResultCount() {
      return maxResultCount;
   }

   public void setMaxResultCount(int maxResultCount) {
      this.maxResultCount = maxResultCount;
   }

   public ProductSortType getSortInstruction() {
      return sortInstruction;
   }

   public void setSortInstruction(ProductSortType sortInstruction) {
      this.sortInstruction = sortInstruction;
   }

   public int getTransferType() {
      return transferType;
   }

   public void setTransferType(int transferType) {
      this.transferType = transferType;
   }
}
