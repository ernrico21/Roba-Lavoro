JSONObject sys  = reader.getJSONObject("sys");
country = sys.getString("country");
			
JSONObject main  = reader.getJSONObject("main");
temperature = main.getString("temp");