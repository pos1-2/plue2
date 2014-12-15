package pos1_2ahif.plue2.impl;

import pos1_2ahif.plue2.api.*;

import javax.xml.bind.DatatypeConverter;
import java.security.CodeSource;
import java.security.SecureClassLoader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Florian on 12.12.2014.
 */
public final class Assets {
    // -- no need to read further, not relevant for exercise!
    private Assets() {
    }

    public static class SolutionLoader extends SecureClassLoader {
        public SolutionLoader(ClassLoader parent) {
            super(parent);

            this.defineClass("pos1_2ahif.plue2.internal.ReferenceSolution$1", DatatypeConverter.parseBase64Binary("yv66vgAAADIAKgkABwAXCgAIABgLAAUAGQoAGgAbBwAcCgAHAB0HAB4HACAHACEBAAZ0aGlzJDABAC1McG9zMV8yYWhpZi9wbHVlMi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbjsBAAY8aW5pdD4BADAoTHBvczFfMmFoaWYvcGx1ZTIvaW50ZXJuYWwvUmVmZXJlbmNlU29sdXRpb247KVYBAARDb2RlAQAHY29tcGFyZQEAQShMcG9zMV8yYWhpZi9wbHVlMi9hcGkvVHJlYXN1cmU7THBvczFfMmFoaWYvcGx1ZTIvYXBpL1RyZWFzdXJlOylJAQAnKExqYXZhL2xhbmcvT2JqZWN0O0xqYXZhL2xhbmcvT2JqZWN0OylJAQAJU2lnbmF0dXJlAQBJTGphdmEvbGFuZy9PYmplY3Q7TGphdmEvdXRpbC9Db21wYXJhdG9yPExwb3MxXzJhaGlmL3BsdWUyL2FwaS9UcmVhc3VyZTs+OwEAD0VuY2xvc2luZ01ldGhvZAcAIgwAIwAkDAAKAAsMAAwAJQwAJgAnBwAoDAAPACkBAB1wb3MxXzJhaGlmL3BsdWUyL2FwaS9UcmVhc3VyZQwADwAQAQAtcG9zMV8yYWhpZi9wbHVlMi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbiQxAQAMSW5uZXJDbGFzc2VzAQAQamF2YS9sYW5nL09iamVjdAEAFGphdmEvdXRpbC9Db21wYXJhdG9yAQArcG9zMV8yYWhpZi9wbHVlMi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbgEAGmdldFRyZWFzdXJlc09yZGVyZWRCeVZhbHVlAQAyKExwb3MxXzJhaGlmL3BsdWUyL2FwaS9MYWJ5cmludGg7KUxqYXZhL3V0aWwvTGlzdDsBAAMoKVYBAAhnZXRWYWx1ZQEAAygpRgEAD2phdmEvbGFuZy9GbG9hdAEABShGRilJACAABwAIAAEACQABEBAACgALAAAAAwAAAAwADQABAA4AAAAWAAIAAgAAAAoqK7UAASq3AAKxAAAAAAABAA8AEAABAA4AAAAdAAIAAwAAABEruQADAQAsuQADAQC4AAR0rAAAAAAQQQAPABEAAQAOAAAAGQADAAMAAAANKivAAAUswAAFtgAGrAAAAAAAAwASAAAAAgATABQAAAAEABUAFgAfAAAACgABAAcAAAAAAAA="), 0, 923, (CodeSource) null);
            this.defineClass("pos1_2ahif.plue2.internal.ReferenceSolution$2", DatatypeConverter.parseBase64Binary("yv66vgAAADIALQkACAAYCgAJABkLAAYAGgsABgAbCgAcAB0HAB4KAAgAHwcAIAcAIgcAIwEABnRoaXMkMAEALUxwb3MxXzJhaGlmL3BsdWUyL2ludGVybmFsL1JlZmVyZW5jZVNvbHV0aW9uOwEABjxpbml0PgEAMChMcG9zMV8yYWhpZi9wbHVlMi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbjspVgEABENvZGUBAAdjb21wYXJlAQBBKExwb3MxXzJhaGlmL3BsdWUyL2FwaS9UcmVhc3VyZTtMcG9zMV8yYWhpZi9wbHVlMi9hcGkvVHJlYXN1cmU7KUkBACcoTGphdmEvbGFuZy9PYmplY3Q7TGphdmEvbGFuZy9PYmplY3Q7KUkBAAlTaWduYXR1cmUBAElMamF2YS9sYW5nL09iamVjdDtMamF2YS91dGlsL0NvbXBhcmF0b3I8THBvczFfMmFoaWYvcGx1ZTIvYXBpL1RyZWFzdXJlOz47AQAPRW5jbG9zaW5nTWV0aG9kBwAkDAAlACYMAAsADAwADQAnDAAoACkMACoAKQcAKwwAEAAsAQAdcG9zMV8yYWhpZi9wbHVlMi9hcGkvVHJlYXN1cmUMABAAEQEALXBvczFfMmFoaWYvcGx1ZTIvaW50ZXJuYWwvUmVmZXJlbmNlU29sdXRpb24kMgEADElubmVyQ2xhc3NlcwEAEGphdmEvbGFuZy9PYmplY3QBABRqYXZhL3V0aWwvQ29tcGFyYXRvcgEAK3BvczFfMmFoaWYvcGx1ZTIvaW50ZXJuYWwvUmVmZXJlbmNlU29sdXRpb24BACNnZXRUcmVhc3VyZXNPcmRlcmVkQnlWYWx1ZVBlcldlaWdodAEAMihMcG9zMV8yYWhpZi9wbHVlMi9hcGkvTGFieXJpbnRoOylMamF2YS91dGlsL0xpc3Q7AQADKClWAQAIZ2V0VmFsdWUBAAMoKUYBAAlnZXRXZWlnaHQBAA9qYXZhL2xhbmcvRmxvYXQBAAUoRkYpSQAgAAgACQABAAoAARAQAAsADAAAAAMAAAANAA4AAQAPAAAAFgACAAIAAAAKKiu1AAEqtwACsQAAAAAAAQAQABEAAQAPAAAAKwADAAMAAAAfK7kAAwEAK7kABAEAbiy5AAMBACy5AAQBAG64AAV0rAAAAAAQQQAQABIAAQAPAAAAGQADAAMAAAANKivAAAYswAAGtgAHrAAAAAAAAwATAAAAAgAUABUAAAAEABYAFwAhAAAACgABAAgAAAAAAAA="), 0, 968, (CodeSource) null);
            this.defineClass("pos1_2ahif.plue2.internal.ReferenceSolution$MyTile", DatatypeConverter.parseBase64Binary("yv66vgAAADIAIgoABwASCQAGABMJAAYAFAoAFQAWCgAHABcHABkHABwBAAhvcmlnaW5hbAEAG0xwb3MxXzJhaGlmL3BsdWUyL2FwaS9UaWxlOwEAD2RpcmVjdGlvbk9wZW5lZAEAIExwb3MxXzJhaGlmL3BsdWUyL2FwaS9EaXJlY3Rpb247AQAGPGluaXQ+AQA+KExwb3MxXzJhaGlmL3BsdWUyL2FwaS9UaWxlO0xwb3MxXzJhaGlmL3BsdWUyL2FwaS9EaXJlY3Rpb247KVYBAARDb2RlAQAPaXNEaXJlY3Rpb25PcGVuAQAjKExwb3MxXzJhaGlmL3BsdWUyL2FwaS9EaXJlY3Rpb247KVoBAA1TdGFja01hcFRhYmxlDAAMAB0MAAgACQwACgALBwAeDAAfACAMAA8AEAcAIQEAMnBvczFfMmFoaWYvcGx1ZTIvaW50ZXJuYWwvUmVmZXJlbmNlU29sdXRpb24kTXlUaWxlAQAGTXlUaWxlAQAMSW5uZXJDbGFzc2VzAQAZcG9zMV8yYWhpZi9wbHVlMi9hcGkvVGlsZQEAAygpVgEAHnBvczFfMmFoaWYvcGx1ZTIvYXBpL0RpcmVjdGlvbgEABmVxdWFscwEAFShMamF2YS9sYW5nL09iamVjdDspWgEAK3BvczFfMmFoaWYvcGx1ZTIvaW50ZXJuYWwvUmVmZXJlbmNlU29sdXRpb24AIAAGAAcAAAACABIACAAJAAAAEgAKAAsAAAACAAEADAANAAEADgAAABsAAgADAAAADyq3AAEqK7UAAiostQADsQAAAAAAAQAPABAAAQAOAAAALwACAAIAAAAYKyq0AAO2AASZAAcEpwALKrQAAiu2AAWsAAAAAQARAAAABQACD0cBAAEAGwAAAAoAAQAGABgAGgAK"), 0, 690, (CodeSource) null);
            this.defineClass("pos1_2ahif.plue2.internal.ReferenceSolution", DatatypeConverter.parseBase64Binary("yv66vgAAADIAxgoAKwBcCABdCwBeAF8LAGAAYQsAYgBjCwBiAGQHAGUHAGYHAGcKAAkAXAsAIABoCgA2AGkHAGoKAA0AawoAbABtBwBuCgAQAGsHAG8KABIAcAsAIABhBwBxCwBeAHIKAAcAcwcAdAoAGABcBwB1CgAaAHYKABgAdwoAEgB4CgAVAHkLAF4AegcAewsAIAB8BwB9CgAiAFwHAH4HAH8KACUAgAoAJACBBwCCCwCDAIQIAIUHAIYLAAgAhwoAiACJCgAkAIoLAIMAaAoAFQCLCgAkAIwLAF4AjQoAJACOBwCPCgA0AJAHAJEHAJIBAAZNeVRpbGUBAAxJbm5lckNsYXNzZXMBAAY8aW5pdD4BAAMoKVYBAARDb2RlAQAJZ2V0TXlOYW1lAQAUKClMamF2YS9sYW5nL1N0cmluZzsBABRnZXRNeUV4YW1BY2NvdW50TmFtZQEADmhhc0FueVRyZWFzdXJlAQAjKExwb3MxXzJhaGlmL3BsdWUyL2FwaS9MYWJ5cmludGg7KVoBAA1TdGFja01hcFRhYmxlBwCTAQAPZ2V0QWxsVHJlYXN1cmVzAQAyKExwb3MxXzJhaGlmL3BsdWUyL2FwaS9MYWJ5cmludGg7KUxqYXZhL3V0aWwvTGlzdDsHAHsBAAlTaWduYXR1cmUBAFMoTHBvczFfMmFoaWYvcGx1ZTIvYXBpL0xhYnlyaW50aDspTGphdmEvdXRpbC9MaXN0PExwb3MxXzJhaGlmL3BsdWUyL2FwaS9UcmVhc3VyZTs+OwEAGmdldFRyZWFzdXJlc09yZGVyZWRCeVZhbHVlAQAjZ2V0VHJlYXN1cmVzT3JkZXJlZEJ5VmFsdWVQZXJXZWlnaHQBABZjbGVhclBhc3NhZ2VzQWxvbmdQYXRoAQAzKExwb3MxXzJhaGlmL3BsdWUyL2FwaS9MYWJ5cmludGg7TGphdmEvdXRpbC9MaXN0OylWBwBvBwBxAQBVKExwb3MxXzJhaGlmL3BsdWUyL2FwaS9MYWJ5cmludGg7TGphdmEvdXRpbC9MaXN0PExwb3MxXzJhaGlmL3BsdWUyL2FwaS9EaXJlY3Rpb247PjspVgEACWpvaW5QYXRocwEAIihMamF2YS91dGlsL0xpc3Q7KUxqYXZhL3V0aWwvTGlzdDsBAHgoTGphdmEvdXRpbC9MaXN0PExqYXZhL3V0aWwvTGlzdDxMcG9zMV8yYWhpZi9wbHVlMi9hcGkvRGlyZWN0aW9uOz47PjspTGphdmEvdXRpbC9MaXN0PExwb3MxXzJhaGlmL3BsdWUyL2FwaS9EaXJlY3Rpb247PjsBABpwcmludFJlcG9ydEZvclRyZWFzdXJlSHVudAEAQShMcG9zMV8yYWhpZi9wbHVlMi9hcGkvTGFieXJpbnRoO0xqYXZhL3V0aWwvTGlzdDtMamF2YS9pby9GaWxlOylWBwCRBwCUBwCVBwCWBwB+BwCPAQBjKExwb3MxXzJhaGlmL3BsdWUyL2FwaS9MYWJ5cmludGg7TGphdmEvdXRpbC9MaXN0PExwb3MxXzJhaGlmL3BsdWUyL2FwaS9EaXJlY3Rpb247PjtMamF2YS9pby9GaWxlOylWDAA6ADsBABJSZWZlcmVuY2UgU29sdXRpb24HAJQMAJcAmAcAmQwAmgCbBwCTDACcAJ0MAJ4AnwEAGXBvczFfMmFoaWYvcGx1ZTIvYXBpL1RpbGUBAB1wb3MxXzJhaGlmL3BsdWUyL2FwaS9UcmVhc3VyZQEAE2phdmEvdXRpbC9BcnJheUxpc3QMAKAAoQwARABFAQAtcG9zMV8yYWhpZi9wbHVlMi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbiQxDAA6AKIHAKMMAKQApQEALXBvczFfMmFoaWYvcGx1ZTIvaW50ZXJuYWwvUmVmZXJlbmNlU29sdXRpb24kMgEAG3BvczFfMmFoaWYvcGx1ZTIvYXBpL0Nvb3JkcwwAOgCmAQAecG9zMV8yYWhpZi9wbHVlMi9hcGkvRGlyZWN0aW9uDACnAKgMAKkAqgEAEWphdmEvdXRpbC9IYXNoTWFwAQAycG9zMV8yYWhpZi9wbHVlMi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbiRNeVRpbGUMADoAqwwArACtDACuAK8MALAAsQwAsgCzAQAOamF2YS91dGlsL0xpc3QMALQAtQEAEWphdmEvdXRpbC9IYXNoU2V0AQATamF2YS9pby9QcmludFdyaXRlcgEAGGphdmEvaW8vRmlsZU91dHB1dFN0cmVhbQwAOgC2DAA6ALcBACZwb3MxXzJhaGlmL3BsdWUyL2FwaS9Db2xsZWN0ZWRUcmVhc3VyZQcAlgwAuAChAQAQRmV0dGUgQmV1dGU6ICVmCgEAEGphdmEvbGFuZy9PYmplY3QMALkAugcAuwwAvAC9DAC+AL8MAMAAPgwAwQDCDADAAMMMAMQAOwEAHWphdmEvaW8vRmlsZU5vdEZvdW5kRXhjZXB0aW9uDADFADsBACtwb3MxXzJhaGlmL3BsdWUyL2ludGVybmFsL1JlZmVyZW5jZVNvbHV0aW9uAQAecG9zMV8yYWhpZi9wbHVlMi9hcGkvRXhlcmNpc2VzAQASamF2YS91dGlsL0l0ZXJhdG9yAQAecG9zMV8yYWhpZi9wbHVlMi9hcGkvTGFieXJpbnRoAQAMamF2YS9pby9GaWxlAQANamF2YS91dGlsL1NldAEABnZhbHVlcwEAGCgpTGphdmEvdXRpbC9Db2xsZWN0aW9uOwEAFGphdmEvdXRpbC9Db2xsZWN0aW9uAQAIaXRlcmF0b3IBABYoKUxqYXZhL3V0aWwvSXRlcmF0b3I7AQAHaGFzTmV4dAEAAygpWgEABG5leHQBABQoKUxqYXZhL2xhbmcvT2JqZWN0OwEAA2FkZAEAFShMamF2YS9sYW5nL09iamVjdDspWgEAMChMcG9zMV8yYWhpZi9wbHVlMi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbjspVgEAFWphdmEvdXRpbC9Db2xsZWN0aW9ucwEABHNvcnQBACkoTGphdmEvdXRpbC9MaXN0O0xqYXZhL3V0aWwvQ29tcGFyYXRvcjspVgEABShJSSlWAQADZ2V0AQAmKExqYXZhL2xhbmcvT2JqZWN0OylMamF2YS9sYW5nL09iamVjdDsBAA9pc0RpcmVjdGlvbk9wZW4BACMoTHBvczFfMmFoaWYvcGx1ZTIvYXBpL0RpcmVjdGlvbjspWgEAPihMcG9zMV8yYWhpZi9wbHVlMi9hcGkvVGlsZTtMcG9zMV8yYWhpZi9wbHVlMi9hcGkvRGlyZWN0aW9uOylWAQADcHV0AQA4KExqYXZhL2xhbmcvT2JqZWN0O0xqYXZhL2xhbmcvT2JqZWN0OylMamF2YS9sYW5nL09iamVjdDsBAAJnbwEAPyhMcG9zMV8yYWhpZi9wbHVlMi9hcGkvRGlyZWN0aW9uOylMcG9zMV8yYWhpZi9wbHVlMi9hcGkvQ29vcmRzOwEAFGdldE9w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"), 0, 4206, (CodeSource) null);
        }
    }

    public static Exercises getReferenceSolution() {
        ClassLoader s = new Assets.SolutionLoader(Assets.class.getClassLoader());
        Exception exception;
        try {
            return (Exercises) s.loadClass("pos1_2ahif.plue2.internal.ReferenceSolution").newInstance();
        } catch (InstantiationException e) {
            exception = e;
        } catch (IllegalAccessException e) {
            exception = e;
        } catch (ClassNotFoundException e) {
            exception = e;
        }

        throw new RuntimeException("Error loading the reference solution: Ask for Prof. Hassanen to help you!");
    }

    private static boolean int2bool(int i) {
        if (i == 0) {
            return false;
        } else {
            return true;
        }
    }

    private static Tile t(int left, int right, int up, int down) {
        final boolean l = int2bool(left), r = int2bool(right), u = int2bool(up), d = int2bool(down);
        return new Tile() {
            @Override
            public boolean isLeftOpen() {
                return l;
            }

            @Override
            public boolean isRightOpen() {
                return r;
            }

            @Override
            public boolean isUpOpen() {
                return u;
            }

            @Override
            public boolean isDownOpen() {
                return d;
            }
        };
    }

    private static abstract class TreasureTile extends Tile implements Treasure {
        private final Tile tile;

        public TreasureTile(Tile tile) {
            this.tile = tile;
        }

        @Override
        public boolean isDirectionOpen(Direction direction) {
            return tile.isDirectionOpen(direction);
        }
    }

    private static Tile t(int left, int right, int up, int down, final float value, final float weight) {
        return new TreasureTile(t(left, right, up, down)) {
            @Override
            public float getValue() {
                return value;
            }

            @Override
            public float getWeight() {
                return weight;
            }
        };
    }

    private static Coords c(int x, int y) {
        return new Coords(x, y);
    }

    public static Map<String, Labyrinth> labyrinths() {
        Map<String, Labyrinth> labs = new HashMap<String, Labyrinth>();

        labs.put("l5x5-no-treasure", new BFSLabyrinth(new HashMap<Coords, Tile>() {{
            put(c(0, 0), t(1, 1, 1, 1));
            put(c(0, -1), t(0, 0, 0, 1));
            put(c(1, 1), t(1, 1, 1, 1));
            put(c(2, 2), t(0, 0, 1, 1));
            put(c(0, 1), t(0, 1, 1, 1));
            put(c(1, 2), t(0, 0, 1, 1));
            put(c(2, 3), t(1, 0, 1, 0));
            put(c(0, 2), t(0, 0, 1, 1));
            put(c(1, 3), t(0, 1, 1, 0));
            put(c(0, 3), t(1, 0, 1, 0));
            put(c(-1, 3), t(0, 1, 1, 0));
            put(c(-2, 2), t(0, 1, 1, 0));
            put(c(-1, 2), t(1, 0, 1, 1));
            put(c(-2, 1), t(0, 1, 0, 1));
            put(c(-1, 1), t(1, 0, 0, 1));
            put(c(2, -1), t(1, 0, 0, 1));
            put(c(-1, 0), t(0, 1, 0, 0));
            put(c(2, 0), t(0, 0, 1, 1));
            put(c(1, -1), t(0, 1, 0, 0));
            put(c(1, 0), t(1, 0, 0, 1));
            put(c(2, 1), t(1, 0, 1, 1));
        }}));

        labs.put("l10x10-treasure-4-8-and-3-1", new BFSLabyrinth(new HashMap<Coords, Tile>() {{
            put(c(0, 0), t(1, 1, 1, 1));
            put(c(0, -1), t(0, 0, 0, 1));
            put(c(0, 1), t(1, 1, 1, 0));
            put(c(0, -2), t(1, 0, 1, 0));
            put(c(0, -3), t(1, 0, 0, 1));
            put(c(0, -4), t(1, 1, 0, 0));
            put(c(0, -5), t(0, 1, 1, 0));
            put(c(0, -6), t(0, 1, 0, 1));
            put(c(5, -5), t(1, 0, 0, 1));
            put(c(5, -4), t(0, 1, 1, 1));
            put(c(5, -3), t(0, 0, 1, 1));
            put(c(1, -7), t(0, 1, 0, 1));
            put(c(1, -6), t(1, 0, 1, 0));
            put(c(5, -2), t(0, 0, 1, 1));
            put(c(1, -5), t(1, 1, 0, 0));
            put(c(5, -1), t(0, 0, 1, 1));
            put(c(5, 0), t(1, 1, 1, 1));
            put(c(1, -4), t(1, 1, 0, 0));
            put(c(5, 1), t(1, 1, 1, 0));
            put(c(1, -3), t(0, 1, 0, 1));
            put(c(-1, 1), t(0, 1, 0, 0));
            put(c(1, -2), t(0, 0, 1, 1));
            put(c(-1, 0), t(0, 1, 0, 0));
            put(c(1, -1), t(0, 1, 1, 0));
            put(c(1, 0), t(1, 0, 0, 0));
            put(c(-1, -1), t(0, 0, 1, 0));
            put(c(1, 1), t(1, 1, 0, 0));
            put(c(-1, -2), t(0, 1, 0, 1));
            put(c(-1, -3), t(0, 1, 1, 0));
            put(c(-1, -4), t(0, 1, 0, 1));
            put(c(6, -8), t(0, 1, 0, 1));
            put(c(6, -7), t(0, 0, 1, 1));
            put(c(6, -6), t(0, 1, 1, 0));
            put(c(6, -5), t(0, 1, 0, 1));
            put(c(6, -4), t(1, 1, 1, 1, 3.0f, 1.0f));
            put(c(6, -3), t(0, 0, 1, 1));
            put(c(2, -7), t(1, 1, 0, 1));
            put(c(6, -2), t(0, 0, 1, 1));
            put(c(2, -6), t(0, 0, 1, 0));
            put(c(6, -1), t(0, 1, 1, 0));
            put(c(2, -5), t(1, 0, 0, 1));
            put(c(6, 0), t(1, 1, 0, 0));
            put(c(2, -4), t(1, 1, 1, 1));
            put(c(6, 1), t(1, 1, 0, 0));
            put(c(2, -3), t(1, 0, 1, 1));
            put(c(2, -2), t(0, 1, 1, 0));
            put(c(2, -1), t(1, 0, 0, 1));
            put(c(2, 0), t(0, 1, 1, 1));
            put(c(2, 1), t(1, 1, 1, 0));
            put(c(7, -8), t(1, 1, 0, 1));
            put(c(7, -7), t(0, 1, 1, 0));
            put(c(7, -6), t(1, 0, 0, 1));
            put(c(7, -5), t(1, 1, 1, 1, 4.0f, 8.0f));
            put(c(7, -4), t(1, 0, 1, 0));
            put(c(7, -3), t(0, 1, 0, 1));
            put(c(3, -7), t(1, 0, 0, 1));
            put(c(7, -2), t(0, 0, 1, 0));
            put(c(3, -6), t(0, 0, 1, 1));
            put(c(7, -1), t(1, 0, 0, 1));
            put(c(3, -5), t(0, 1, 1, 0));
            put(c(7, 0), t(1, 0, 1, 0));
            put(c(3, -4), t(1, 1, 0, 1));
            put(c(7, 1), t(1, 1, 0, 0));
            put(c(3, -3), t(0, 1, 1, 1));
            put(c(3, -2), t(1, 0, 1, 0));
            put(c(3, 0), t(1, 0, 0, 1));
            put(c(3, 1), t(1, 0, 1, 0));
            put(c(8, -8), t(1, 0, 0, 1));
            put(c(8, -7), t(1, 0, 1, 0));
            put(c(8, -5), t(1, 0, 0, 0));
            put(c(8, -3), t(1, 0, 0, 1));
            put(c(8, -2), t(0, 0, 1, 1));
            put(c(8, -1), t(0, 0, 1, 1));
            put(c(4, -5), t(1, 1, 0, 0));
            put(c(8, 0), t(0, 0, 1, 1));
            put(c(4, -4), t(1, 0, 0, 1));
            put(c(8, 1), t(1, 0, 1, 0));
            put(c(4, -3), t(1, 0, 1, 0));
            put(c(4, 0), t(0, 1, 0, 1));
            put(c(4, 1), t(0, 1, 1, 0));
        }}));

        labs.put("l35x15-treasure-14-8--3-1--13-1--2-1--1-1-and-1-7", new BFSLabyrinth(new HashMap<Coords, Tile>() {{
            put(c(0, 0), t(1, 1, 1, 1));
            put(c(0, -1), t(1, 0, 0, 1));
            put(c(33, 1), t(1, 0, 0, 1));
            put(c(0, 1), t(0, 0, 1, 0));
            put(c(33, 2), t(0, 0, 1, 0));
            put(c(0, -2), t(0, 1, 1, 0));
            put(c(33, 3), t(1, 0, 0, 0));
            put(c(0, -3), t(0, 0, 1, 1));
            put(c(0, 2), t(1, 0, 0, 1));
            put(c(0, -4), t(1, 0, 0, 1));
            put(c(0, 3), t(0, 1, 1, 0));
            put(c(0, 4), t(1, 0, 0, 1));
            put(c(0, 5), t(0, 0, 1, 1));
            put(c(0, 6), t(0, 0, 1, 1));
            put(c(0, 7), t(1, 0, 1, 0));
            put(c(-1, 7), t(0, 1, 1, 0));
            put(c(-1, 6), t(0, 0, 1, 1));
            put(c(1, -6), t(0, 1, 0, 1));
            put(c(-1, 5), t(0, 0, 0, 1));
            put(c(1, -5), t(0, 0, 1, 1));
            put(c(-1, 4), t(0, 1, 1, 0));
            put(c(1, -4), t(0, 0, 1, 1));
            put(c(-1, 3), t(0, 0, 1, 1));
            put(c(1, -3), t(0, 0, 1, 1));
            put(c(-1, 2), t(0, 1, 0, 1));
            put(c(1, -2), t(1, 0, 1, 0));
            put(c(-1, 0), t(0, 1, 0, 0));
            put(c(1, -1), t(0, 1, 0, 1));
            put(c(1, 0), t(1, 0, 1, 0));
            put(c(-1, -1), t(0, 1, 1, 0));
            put(c(-1, -2), t(0, 0, 1, 1));
            put(c(1, 1), t(0, 1, 0, 1));
            put(c(-1, -3), t(0, 0, 1, 1));
            put(c(1, 2), t(0, 1, 1, 0));
            put(c(-1, -4), t(0, 1, 0, 1));
            put(c(1, 3), t(1, 1, 0, 0));
            put(c(2, -7), t(0, 1, 0, 1));
            put(c(2, -6), t(1, 1, 1, 0));
            put(c(2, -5), t(0, 1, 0, 1));
            put(c(2, -4), t(0, 1, 1, 1));
            put(c(2, -3), t(0, 1, 1, 1));
            put(c(2, -2), t(0, 1, 1, 1));
            put(c(2, -1), t(1, 1, 1, 1));
            put(c(2, 0), t(0, 1, 1, 0));
            put(c(2, 1), t(1, 1, 0, 0));
            put(c(2, 2), t(1, 1, 0, 0));
            put(c(2, 3), t(1, 0, 0, 1));
            put(c(2, 4), t(0, 1, 1, 0));
            put(c(2, 5), t(0, 1, 0, 1));
            put(c(2, 6), t(0, 1, 1, 0));
            put(c(3, -7), t(1, 1, 0, 0));
            put(c(3, -6), t(1, 1, 0, 1));
            put(c(3, -5), t(1, 0, 1, 0));
            put(c(3, -4), t(1, 0, 0, 1));
            put(c(3, -3), t(1, 0, 1, 0));
            put(c(3, -2), t(1, 0, 0, 1));
            put(c(3, -1), t(1, 0, 1, 1));
            put(c(3, 0), t(1, 0, 1, 1));
            put(c(3, 1), t(1, 0, 1, 0));
            put(c(3, 2), t(1, 0, 0, 1));
            put(c(3, 3), t(0, 1, 1, 0));
            put(c(3, 4), t(1, 0, 0, 1));
            put(c(3, 5), t(1, 0, 1, 0));
            put(c(3, 6), t(1, 0, 0, 1));
            put(c(3, 7), t(0, 1, 1, 0));
            put(c(4, -7), t(1, 1, 0, 1));
            put(c(4, -6), t(1, 0, 1, 1));
            put(c(4, -5), t(0, 1, 1, 0));
            put(c(4, -4), t(0, 1, 0, 1));
            put(c(4, -3), t(0, 0, 1, 1));
            put(c(4, -2), t(0, 0, 1, 1));
            put(c(4, -1), t(0, 0, 1, 1));
            put(c(4, 0), t(0, 1, 1, 0));
            put(c(4, 3), t(1, 0, 0, 1));
            put(c(4, 4), t(0, 0, 1, 1));
            put(c(4, 5), t(0, 0, 1, 1));
            put(c(4, 6), t(0, 1, 1, 0));
            put(c(4, 7), t(1, 1, 0, 0));
            put(c(5, -7), t(1, 1, 0, 0));
            put(c(5, -6), t(0, 1, 0, 1));
            put(c(5, -5), t(1, 1, 1, 0));
            put(c(5, -4), t(1, 1, 0, 0));
            put(c(5, -3), t(0, 1, 0, 1));
            put(c(5, -2), t(0, 0, 1, 1));
            put(c(5, -1), t(0, 1, 1, 0));
            put(c(5, 0), t(1, 0, 0, 1));
            put(c(5, 1), t(0, 1, 1, 0));
            put(c(5, 2), t(0, 1, 0, 0));
            put(c(5, 6), t(1, 0, 0, 1));
            put(c(5, 7), t(1, 0, 1, 0));
            put(c(6, -7), t(1, 0, 0, 1));
            put(c(6, -6), t(1, 0, 1, 1));
            put(c(6, -5), t(1, 1, 1, 1));
            put(c(6, -4), t(1, 1, 1, 1));
            put(c(6, -3), t(1, 1, 1, 1));
            put(c(6, -2), t(0, 1, 1, 1));
            put(c(6, -1), t(1, 1, 1, 1));
            put(c(6, 0), t(0, 0, 1, 1));
            put(c(6, 1), t(1, 0, 1, 1));
            put(c(6, 2), t(1, 1, 1, 1, 1.0f, 1.0f));
            put(c(6, 3), t(0, 0, 1, 0));
            put(c(7, -7), t(0, 1, 0, 1));
            put(c(7, -6), t(0, 0, 1, 0));
            put(c(7, -5), t(1, 0, 0, 1));
            put(c(7, -4), t(1, 1, 1, 1));
            put(c(7, -3), t(1, 1, 1, 1));
            put(c(7, -2), t(1, 1, 1, 0));
            put(c(7, -1), t(1, 1, 0, 1));
            put(c(7, 0), t(0, 0, 1, 1));
            put(c(7, 1), t(0, 1, 1, 1));
            put(c(7, 2), t(1, 0, 1, 0));
            put(c(7, 3), t(0, 0, 0, 1));
            put(c(7, 4), t(0, 1, 1, 0));
            put(c(8, -7), t(1, 0, 0, 1));
            put(c(8, -6), t(0, 1, 1, 0));
            put(c(8, -5), t(0, 1, 0, 1));
            put(c(8, -4), t(1, 0, 1, 0));
            put(c(8, -3), t(1, 1, 0, 0));
            put(c(8, -2), t(1, 0, 0, 1));
            put(c(8, -1), t(1, 0, 1, 0));
            put(c(8, 0), t(0, 1, 0, 1));
            put(c(8, 1), t(1, 1, 1, 0));
            put(c(8, 2), t(0, 1, 0, 1));
            put(c(8, 3), t(0, 0, 1, 1));
            put(c(8, 4), t(1, 1, 1, 1));
            put(c(8, 5), t(0, 1, 1, 0));
            put(c(8, 6), t(0, 1, 0, 1));
            put(c(8, 7), t(0, 1, 1, 0));
            put(c(9, -7), t(0, 1, 0, 1));
            put(c(9, -6), t(1, 0, 1, 0));
            put(c(9, -5), t(1, 0, 0, 0));
            put(c(9, -4), t(0, 1, 0, 1));
            put(c(9, -3), t(1, 0, 1, 0));
            put(c(9, 0), t(1, 1, 0, 0));
            put(c(9, 1), t(1, 0, 0, 1));
            put(c(9, 2), t(1, 1, 1, 1));
            put(c(9, 3), t(0, 1, 1, 0));
            put(c(9, 4), t(1, 1, 0, 1));
            put(c(9, 5), t(1, 0, 1, 0));
            put(c(9, 6), t(1, 1, 0, 1));
            put(c(9, 7), t(1, 1, 1, 0));
            put(c(10, -7), t(1, 1, 0, 0));
            put(c(10, -5), t(0, 1, 0, 1));
            put(c(10, -4), t(1, 0, 1, 0));
            put(c(10, 0), t(1, 0, 0, 1));
            put(c(10, 1), t(0, 0, 1, 1));
            put(c(10, 2), t(1, 0, 1, 1));
            put(c(10, 3), t(1, 1, 1, 0));
            put(c(10, 4), t(1, 0, 0, 1));
            put(c(10, 5), t(0, 1, 1, 0));
            put(c(10, 6), t(1, 1, 0, 0));
            put(c(10, 7), t(1, 1, 0, 0));
            put(c(11, -7), t(1, 1, 0, 0));
            put(c(11, -5), t(1, 1, 0, 0));
            put(c(11, 2), t(0, 1, 0, 0));
            put(c(11, 3), t(1, 1, 0, 1));
            put(c(11, 4), t(0, 0, 1, 1));
            put(c(11, 5), t(1, 1, 1, 0));
            put(c(11, 6), t(1, 1, 0, 0));
            put(c(11, 7), t(1, 0, 0, 0));
            put(c(12, -7), t(1, 0, 0, 1));
            put(c(12, -6), t(0, 0, 1, 1));
            put(c(12, -5), t(1, 0, 1, 0));
            put(c(12, -3), t(0, 1, 0, 1));
            put(c(12, -2), t(0, 1, 1, 0));
            put(c(12, 1), t(0, 0, 0, 1));
            put(c(12, 2), t(1, 1, 1, 1, 1.0f, 7.0f));
            put(c(12, 3), t(1, 1, 1, 0));
            put(c(12, 4), t(0, 1, 0, 0));
            put(c(12, 5), t(1, 1, 0, 1));
            put(c(12, 6), t(1, 0, 1, 1));
            put(c(12, 7), t(0, 1, 1, 0));
            put(c(13, -5), t(0, 1, 0, 1));
            put(c(13, -4), t(0, 1, 1, 1));
            put(c(13, -3), t(1, 0, 1, 1));
            put(c(13, -2), t(1, 0, 1, 1));
            put(c(13, -1), t(0, 1, 1, 1));
            put(c(13, 0), t(0, 1, 1, 0));
            put(c(13, 2), t(1, 1, 0, 0));
            put(c(13, 3), t(1, 0, 0, 1));
            put(c(13, 4), t(1, 0, 1, 0));
            put(c(13, 5), t(1, 1, 0, 0));
            put(c(13, 6), t(0, 1, 0, 1));
            put(c(13, 7), t(1, 0, 1, 0));
            put(c(14, -6), t(0, 1, 0, 1));
            put(c(14, -5), t(1, 0, 1, 1));
            put(c(14, -4), t(1, 1, 1, 1));
            put(c(14, -3), t(0, 0, 1, 1));
            put(c(14, -2), t(0, 0, 1, 1));
            put(c(14, -1), t(1, 1, 1, 0));
            put(c(14, 0), t(1, 1, 0, 0));
            put(c(14, 1), t(0, 1, 0, 1));
            put(c(14, 2), t(1, 1, 1, 1));
            put(c(14, 3), t(0, 1, 1, 0));
            put(c(14, 5), t(1, 1, 0, 0));
            put(c(14, 6), t(1, 1, 0, 0));
            put(c(14, 7), t(0, 1, 0, 0));
            put(c(15, -6), t(1, 0, 0, 1));
            put(c(15, -5), t(0, 0, 1, 1));
            put(c(15, -4), t(1, 0, 1, 0));
            put(c(15, -3), t(0, 1, 0, 1));
            put(c(15, -2), t(0, 0, 1, 1));
            put(c(15, -1), t(1, 0, 1, 0));
            put(c(15, 0), t(1, 1, 0, 0));
            put(c(15, 1), t(1, 1, 0, 0));
            put(c(15, 2), t(1, 0, 0, 1));
            put(c(15, 3), t(1, 0, 1, 1));
            put(c(15, 4), t(0, 1, 1, 0));
            put(c(15, 5), t(1, 0, 0, 1));
            put(c(15, 6), t(1, 1, 1, 0));
            put(c(15, 7), t(1, 1, 0, 0));
            put(c(16, -4), t(0, 1, 0, 1));
            put(c(16, -3), t(1, 1, 1, 1));
            put(c(16, -2), t(0, 1, 1, 1));
            put(c(16, -1), t(0, 1, 1, 0));
            put(c(16, 0), t(1, 1, 0, 0));
            put(c(16, 1), t(1, 0, 0, 1));
            put(c(16, 2), t(0, 1, 1, 1));
            put(c(16, 3), t(0, 1, 1, 0));
            put(c(16, 4), t(1, 1, 0, 1));
            put(c(16, 5), t(0, 1, 1, 1));
            put(c(16, 6), t(1, 1, 1, 1));
            put(c(16, 7), t(1, 0, 1, 0));
            put(c(17, -5), t(0, 1, 0, 1));
            put(c(17, -4), t(1, 1, 1, 0));
            put(c(17, -3), t(1, 1, 0, 1));
            put(c(17, -2), t(1, 0, 1, 0));
            put(c(17, -1), t(1, 1, 0, 1));
            put(c(17, 0), t(1, 1, 1, 1));
            put(c(17, 1), t(0, 0, 1, 1));
            put(c(17, 2), t(1, 1, 1, 1));
            put(c(17, 3), t(1, 1, 1, 1));
            put(c(17, 4), t(1, 1, 1, 1));
            put(c(17, 5), t(1, 0, 1, 0));
            put(c(17, 6), t(1, 1, 0, 1));
            put(c(17, 7), t(0, 1, 1, 0));
            put(c(18, -5), t(1, 0, 0, 1));
            put(c(18, -4), t(1, 1, 1, 0));
            put(c(18, -3), t(1, 1, 0, 1));
            put(c(18, -2), t(0, 0, 1, 1));
            put(c(18, -1), t(1, 0, 1, 1));
            put(c(18, 0), t(1, 0, 1, 1));
            put(c(18, 1), t(0, 0, 1, 0));
            put(c(18, 2), t(1, 1, 0, 0));
            put(c(18, 3), t(1, 1, 0, 0));
            put(c(18, 4), t(1, 1, 0, 0));
            put(c(18, 5), t(0, 0, 0, 1));
            put(c(18, 6), t(1, 1, 1, 1, 2.0f, 1.0f));
            put(c(18, 7), t(1, 0, 1, 0));
            put(c(19, -7), t(0, 1, 0, 1));
            put(c(19, -6), t(0, 1, 1, 0));
            put(c(19, -4), t(1, 0, 0, 1));
            put(c(19, -3), t(1, 1, 1, 1));
            put(c(19, -2), t(0, 1, 1, 0));
            put(c(19, -1), t(0, 0, 0, 1));
            put(c(19, 0), t(0, 1, 1, 1));
            put(c(19, 1), t(0, 0, 1, 1));
            put(c(19, 2), t(1, 1, 1, 0));
            put(c(19, 3), t(1, 1, 0, 0));
            put(c(19, 4), t(1, 0, 0, 1));
            put(c(19, 5), t(0, 1, 1, 1));
            put(c(19, 6), t(1, 1, 1, 1));
            put(c(19, 7), t(0, 1, 1, 0));
            put(c(20, -7), t(1, 1, 0, 1));
            put(c(20, -6), t(1, 1, 1, 1));
            put(c(20, -5), t(0, 0, 1, 1));
            put(c(20, -4), t(0, 0, 1, 1));
            put(c(20, -3), t(1, 1, 1, 0));
            put(c(20, -2), t(1, 0, 0, 1));
            put(c(20, -1), t(0, 1, 1, 1));
            put(c(20, 0), t(1, 1, 1, 1));
            put(c(20, 1), t(0, 1, 1, 0));
            put(c(20, 2), t(1, 1, 0, 0));
            put(c(20, 3), t(1, 0, 0, 1));
            put(c(20, 4), t(0, 1, 1, 1));
            put(c(20, 5), t(1, 1, 1, 1));
            put(c(20, 6), t(1, 0, 1, 0));
            put(c(20, 7), t(1, 0, 0, 0));
            put(c(21, -7), t(1, 0, 0, 1));
            put(c(21, -6), t(1, 0, 1, 1));
            put(c(21, -5), t(0, 0, 1, 1));
            put(c(21, -4), t(0, 1, 1, 0));
            put(c(21, -3), t(1, 0, 0, 1));
            put(c(21, -2), t(0, 0, 1, 1));
            put(c(21, -1), t(1, 0, 1, 0));
            put(c(21, 0), t(1, 1, 0, 0));
            put(c(21, 1), t(1, 1, 0, 0));
            put(c(21, 2), t(1, 1, 0, 0));
            put(c(21, 3), t(0, 1, 0, 1));
            put(c(21, 4), t(1, 1, 1, 0));
            put(c(21, 5), t(1, 1, 0, 1));
            put(c(21, 6), t(0, 0, 1, 1));
            put(c(21, 7), t(0, 1, 1, 0));
            put(c(22, -7), t(0, 1, 0, 1));
            put(c(22, -6), t(0, 1, 1, 0));
            put(c(22, -5), t(0, 0, 0, 1));
            put(c(22, -4), t(1, 1, 1, 1, 13.0f, 1.0f));
            put(c(22, -3), t(0, 1, 1, 0));
            put(c(22, -1), t(0, 1, 0, 1));
            put(c(22, 0), t(1, 1, 1, 0));
            put(c(22, 1), t(1, 0, 0, 0));
            put(c(22, 2), t(1, 0, 0, 1));
            put(c(22, 3), t(1, 1, 1, 0));
            put(c(22, 4), t(1, 1, 0, 1));
            put(c(22, 5), t(1, 0, 1, 0));
            put(c(22, 6), t(0, 1, 0, 1));
            put(c(22, 7), t(1, 0, 1, 0));
            put(c(23, -7), t(1, 0, 0, 1));
            put(c(23, -6), t(1, 1, 1, 1));
            put(c(23, -5), t(0, 1, 1, 0));
            put(c(23, -4), t(1, 0, 0, 0));
            put(c(23, -3), t(1, 1, 0, 0));
            put(c(23, -1), t(1, 0, 0, 1));
            put(c(23, 0), t(1, 1, 1, 1));
            put(c(23, 1), t(0, 0, 1, 1));
            put(c(23, 2), t(0, 1, 1, 0));
            put(c(23, 3), t(1, 1, 0, 1));
            put(c(23, 4), t(1, 1, 1, 1));
            put(c(23, 5), t(0, 1, 1, 0));
            put(c(23, 6), t(1, 0, 0, 1));
            put(c(23, 7), t(0, 1, 1, 0));
            put(c(24, -7), t(0, 0, 0, 1));
            put(c(24, -6), t(1, 1, 1, 1, 3.0f, 1.0f));
            put(c(24, -5), t(1, 0, 1, 1));
            put(c(24, -4), t(0, 1, 1, 1));
            put(c(24, -3), t(1, 0, 1, 0));
            put(c(24, -2), t(0, 1, 0, 1));
            put(c(24, -1), t(0, 1, 1, 0));
            put(c(24, 0), t(1, 0, 0, 1));
            put(c(24, 1), t(0, 1, 1, 1));
            put(c(24, 2), t(1, 0, 1, 1));
            put(c(24, 3), t(1, 1, 1, 0));
            put(c(24, 4), t(1, 1, 0, 0));
            put(c(24, 5), t(1, 0, 0, 1));
            put(c(24, 6), t(0, 1, 1, 0));
            put(c(24, 7), t(1, 1, 0, 0));
            put(c(25, -7), t(0, 1, 0, 1));
            put(c(25, -6), t(1, 0, 1, 0));
            put(c(25, -5), t(0, 1, 0, 1));
            put(c(25, -4), t(1, 0, 1, 0));
            put(c(25, -3), t(0, 1, 0, 1));
            put(c(25, -2), t(1, 0, 1, 0));
            put(c(25, -1), t(1, 0, 0, 1));
            put(c(25, 0), t(0, 1, 1, 0));
            put(c(25, 1), t(1, 1, 0, 1));
            put(c(25, 2), t(0, 0, 1, 0));
            put(c(25, 3), t(1, 1, 0, 0));
            put(c(25, 4), t(1, 0, 0, 1));
            put(c(25, 5), t(0, 1, 1, 1));
            put(c(25, 6), t(1, 1, 1, 1));
            put(c(25, 7), t(1, 1, 1, 0));
            put(c(26, -7), t(1, 1, 0, 0));
            put(c(26, -5), t(1, 0, 0, 1));
            put(c(26, -4), t(0, 0, 1, 1));
            put(c(26, -3), t(1, 1, 1, 0));
            put(c(26, -2), t(0, 1, 0, 1));
            put(c(26, -1), t(0, 0, 1, 1));
            put(c(26, 0), t(1, 0, 1, 0));
            put(c(26, 1), t(1, 1, 0, 1));
            put(c(26, 2), t(0, 0, 1, 1));
            put(c(26, 3), t(1, 0, 1, 0));
            put(c(26, 5), t(1, 1, 0, 1));
            put(c(26, 6), t(1, 0, 1, 1));
            put(c(26, 7), t(1, 1, 1, 0));
            put(c(27, -7), t(1, 0, 0, 1));
            put(c(27, -6), t(0, 1, 1, 0));
            put(c(27, -5), t(0, 1, 0, 1));
            put(c(27, -4), t(0, 1, 1, 0));
            put(c(27, -3), t(1, 1, 0, 0));
            put(c(27, -2), t(1, 1, 0, 1));
            put(c(27, -1), t(0, 0, 1, 1));
            put(c(27, 0), t(0, 1, 1, 1));
            put(c(27, 1), t(1, 1, 1, 0));
            put(c(27, 5), t(1, 0, 0, 1));
            put(c(27, 6), t(0, 0, 1, 1));
            put(c(27, 7), t(1, 0, 1, 0));
            put(c(28, -6), t(1, 1, 0, 0));
            put(c(28, -5), t(1, 1, 0, 0));
            put(c(28, -4), t(1, 0, 0, 1));
            put(c(28, -3), t(1, 1, 1, 0));
            put(c(28, -2), t(1, 0, 0, 1));
            put(c(28, -1), t(0, 1, 1, 0));
            put(c(28, 0), t(1, 0, 0, 0));
            put(c(28, 1), t(1, 1, 0, 0));
            put(c(29, -7), t(0, 1, 0, 1));
            put(c(29, -6), t(1, 0, 1, 0));
            put(c(29, -5), t(1, 0, 0, 1));
            put(c(29, -4), t(0, 1, 1, 1));
            put(c(29, -3), t(1, 0, 1, 1));
            put(c(29, -2), t(0, 1, 1, 1));
            put(c(29, -1), t(1, 1, 1, 1));
            put(c(29, 0), t(0, 1, 1, 1));
            put(c(29, 1), t(1, 0, 1, 0));
            put(c(30, -7), t(1, 1, 0, 1));
            put(c(30, -6), t(0, 1, 1, 0));
            put(c(30, -5), t(0, 1, 0, 1));
            put(c(30, -4), t(1, 1, 1, 1));
            put(c(30, -3), t(0, 0, 1, 1));
            put(c(30, -2), t(1, 0, 1, 1));
            put(c(30, -1), t(1, 0, 1, 1));
            put(c(30, 0), t(1, 1, 1, 1));
            put(c(30, 1), t(0, 0, 1, 1));
            put(c(30, 2), t(0, 1, 1, 0));
            put(c(31, -7), t(1, 1, 0, 0));
            put(c(31, -6), t(1, 0, 0, 1));
            put(c(31, -5), t(1, 0, 1, 0));
            put(c(31, -4), t(1, 0, 0, 1));
            put(c(31, -3), t(0, 0, 1, 1));
            put(c(31, -2), t(0, 1, 1, 0));
            put(c(31, -1), t(0, 1, 0, 1));
            put(c(31, 0), t(1, 0, 1, 0));
            put(c(31, 1), t(0, 0, 0, 1));
            put(c(31, 2), t(1, 0, 1, 0));
            put(c(31, 3), t(0, 1, 0, 0));
            put(c(32, -7), t(1, 0, 0, 1));
            put(c(32, -6), t(0, 1, 1, 1));
            put(c(32, -5), t(0, 1, 1, 1));
            put(c(32, -4), t(0, 1, 1, 0));
            put(c(32, -2), t(1, 0, 0, 1));
            put(c(32, -1), t(1, 0, 1, 0));
            put(c(32, 0), t(0, 1, 0, 1));
            put(c(32, 1), t(0, 1, 1, 0));
            put(c(32, 2), t(0, 0, 0, 1));
            put(c(32, 3), t(1, 1, 1, 1, 14.0f, 8.0f));
            put(c(32, 4), t(0, 0, 1, 0));
            put(c(33, -6), t(1, 0, 0, 1));
            put(c(33, -5), t(1, 0, 1, 0));
            put(c(33, -4), t(1, 0, 0, 1));
            put(c(33, -3), t(0, 0, 1, 1));
            put(c(33, -2), t(0, 0, 1, 1));
            put(c(33, -1), t(0, 0, 1, 1));
            put(c(33, 0), t(1, 0, 1, 0));
        }}));

        return labs;
    }
}
