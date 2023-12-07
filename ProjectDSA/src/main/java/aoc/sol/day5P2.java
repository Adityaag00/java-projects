package aoc.sol;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class day5P2 {
    static long mod = 1000000007;
    static int inf = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter(System.out);
        AtomicLong total = new AtomicLong(Long.MAX_VALUE);
        long startTime = System.nanoTime();
        List<Long> seeds = new ArrayList<>();
        List<String> seedToSoilMap = new ArrayList<>();
        List<String> soilToFertilizerMap = new ArrayList<>();
        List<String> fertilizerToWaterMap = new ArrayList<>();
        List<String> waterToLightMap = new ArrayList<>();
        List<String> lightToTemperatureMap = new ArrayList<>();
        List<String> temperatureToHumidityMap = new ArrayList<>();
        List<String> humidityToLocationMap = new ArrayList<>();
        AtomicReference<String> current = new AtomicReference<>("");
        Files.readAllLines(Path.of("F:\\Programming Workspace\\JAVA\\ProjectDSA\\src\\main\\java\\aoc\\input\\day5.txt")).forEach(input -> {
            if (input.startsWith("seeds")) {
                String[] seedT = input.split(":")[1].split(" ");
                seedT = Arrays.stream(seedT).filter(s -> !s.equals("") && !s.equals(" ")).toArray(String[]::new);
                for (String s : seedT) {
                    seeds.add(Long.parseLong(s));
                }
            }
            if (input.equals("seed-to-soil map:")) {
                current.set("seed-to-soil map");
            } else if (input.equals("soil-to-fertilizer map:")) {
                current.set("soil-to-fertilizer map");
            } else if (input.equals("fertilizer-to-water map:")) {
                current.set("fertilizer-to-water map");
            } else if (input.equals("water-to-light map:")) {
                current.set("water-to-light map");
            } else if (input.equals("light-to-temperature map:")) {
                current.set("light-to-temperature map");
            } else if (input.equals("temperature-to-humidity map:")) {
                current.set("temperature-to-humidity map");
            } else if (input.equals("humidity-to-location map:")) {
                current.set("humidity-to-location map");
            } else if (!input.equals("") && !input.equals(" ")) {
                switch (current.get()) {
                    case "seed-to-soil map":
                        seedToSoilMap.add(input);
                        break;
                    case "soil-to-fertilizer map":
                        soilToFertilizerMap.add(input);
                        break;
                    case "fertilizer-to-water map":
                        fertilizerToWaterMap.add(input);
                        break;
                    case "water-to-light map":
                        waterToLightMap.add(input);
                        break;
                    case "light-to-temperature map":
                        lightToTemperatureMap.add(input);
                        break;
                    case "temperature-to-humidity map":
                        temperatureToHumidityMap.add(input);
                        break;
                    case "humidity-to-location map":
                        humidityToLocationMap.add(input);
                        break;
                }
            }
        });
        Collections.sort(seedToSoilMap);
        current.set("seed-to-soil map");
        List<Pair> seedPairs = new ArrayList<>();
        for (int i = 0; i < seeds.size(); i += 2) {
            seedPairs.add(new Pair(seeds.get(i), seeds.get(i + 1)));
        }
        for (Pair seedPair : seedPairs) {
            List<Pair> fertilizerPairs = new ArrayList<>();
            List<Pair> waterPairs = new ArrayList<>();
            List<Pair> lightPairs = new ArrayList<>();
            List<Pair> temperaturePairs = new ArrayList<>();
            List<Pair> humidityPairs = new ArrayList<>();

            for (String s : seedToSoilMap) {
                List<Pair> soilPairs = new ArrayList<>();
                long[] range = Arrays.stream(s.split(" ")).filter(s1 -> !s1.equals("") && !s1.equals(" "))
                        .mapToLong(Long::parseLong).toArray();

            }
        }

        long endTime = System.nanoTime();
        out.println(total.get());
        out.println("Took " + (endTime - startTime) / 1000000 + " ms");
        out.close();
    }


    public static long gcd(long x, long y) {
        if (x % y == 0)
            return y;
        else
            return gcd(y, x % y);
    }

    public static long pow(long n, long p, long m) {
        long result = 1;
        if (p == 0)
            return 1;
        if (p == 1)
            return n;
        while (p != 0) {
            if (p % 2 == 1)
                result *= n;
            if (result >= m)
                result %= m;
            p >>= 1;
            n *= n;
            if (n >= m)
                n %= m;
        }
        return result;
    }

    static class Pair {
        long a, b;

        Pair(long a, long b) {
            this.a = a;
            this.b = b;
        }

        public boolean equals(Object o) {
            if (o instanceof Day1.Pair) {
                Day1.Pair p = (Day1.Pair) o;
                return p.a == a && p.b == b;
            }
            return false;
        }
    }

    public static class Debug {
        //change to System.getProperty("ONLINE_JUDGE")==null; for CodeForces
//		public static final boolean LOCAL = System.getProperty("LOCAL")!=null;
        private static <T> String ts(T t) {
            if (t == null) {
                return "null";
            }
            try {
                return ts((Iterable) t);
            } catch (ClassCastException e) {
                if (t instanceof int[]) {
                    String s = Arrays.toString((int[]) t);
                    return "{" + s.substring(1, s.length() - 1) + "}";
                } else if (t instanceof long[]) {
                    String s = Arrays.toString((long[]) t);
                    return "{" + s.substring(1, s.length() - 1) + "}";
                } else if (t instanceof char[]) {
                    String s = Arrays.toString((char[]) t);
                    return "{" + s.substring(1, s.length() - 1) + "}";
                } else if (t instanceof double[]) {
                    String s = Arrays.toString((double[]) t);
                    return "{" + s.substring(1, s.length() - 1) + "}";
                } else if (t instanceof boolean[]) {
                    String s = Arrays.toString((boolean[]) t);
                    return "{" + s.substring(1, s.length() - 1) + "}";
                }
                try {
                    return ts((Object[]) t);
                } catch (ClassCastException e1) {
                    return t.toString();
                }
            }
        }

        private static <T> String ts(T[] arr) {
            StringBuilder ret = new StringBuilder();
            ret.append("{");
            boolean first = true;
            for (T t : arr) {
                if (!first) {
                    ret.append(", ");
                }
                first = false;
                ret.append(ts(t));
            }
            ret.append("}");
            return ret.toString();
        }

        private static <T> String ts(Iterable<T> iter) {
            StringBuilder ret = new StringBuilder();
            ret.append("{");
            boolean first = true;
            for (T t : iter) {
                if (!first) {
                    ret.append(", ");
                }
                first = false;
                ret.append(ts(t));
            }
            ret.append("}");
            return ret.toString();
        }

        public static void dbg(Object... o) {
//			if(LOCAL) {
            System.err.print("Line #" + Thread.currentThread().getStackTrace()[2].getLineNumber() + ": [");
            for (int i = 0; i < o.length; i++) {
                if (i != 0) {
                    System.err.print(", ");
                }
                System.err.print(ts(o[i]));
            }
            System.err.println("]");
//			}
        }
    }

    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() throws FileNotFoundException {
            br = new BufferedReader(new FileReader("..//input//day1.txt"));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        String nextLine() throws IOException {
            String st = br.readLine();
            return st;
        }
    }
}
