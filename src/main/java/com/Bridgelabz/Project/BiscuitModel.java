package com.Bridgelabz.Project;


	import java.util.List;

	public class BiscuitModel {
		private List<Parle> Parle;
		private List<Marie> Marie;
		private List<Orieo> Oreo;
		

		private int totalValueOfAllStock;

		public List<Parle> getParle() {
			return Parle;
		}

		public void setParle(List<Parle> parle) {
			Parle = parle;
		}

		public List<Marie> getMarie() {
			return Marie;
		}

		public void setMarie(List<Marie> marie) {
			Marie = marie;
		}

		public List<Orieo> getOreo() {
			return Oreo;
		}

		public void setOreo(List<Orieo> oreo) {
			Oreo = oreo;
		}


		public int getTotalValueOfAllStock() {
			return totalValueOfAllStock;
		}

		public void setTotalValueOfAllStock(int totalValueOfAllStock) {
			this.totalValueOfAllStock = totalValueOfAllStock;
		}

	}

