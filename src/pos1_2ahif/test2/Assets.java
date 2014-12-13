package pos1_2ahif.test2;

import pos1_2ahif.test2.Labyrinth.Passage;
import pos1_2ahif.test2.Labyrinth.Treasure;
import pos1_2ahif.test2.api.Coords;
import pos1_2ahif.test2.api.Direction;
import pos1_2ahif.test2.api.Tile;

import javax.xml.bind.DatatypeConverter;
import java.security.CodeSource;
import java.security.SecureClassLoader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Florian on 12.12.2014.
 */
public final class Assets {
    private Assets() {
    }

    public static class SolutionLoader extends SecureClassLoader {
        public SolutionLoader(ClassLoader parent) {
            super(parent);

            this.defineClass("pos1_2ahif.test2.ReferenceSolution$1", DatatypeConverter.parseBase64Binary("yv66vgAAADIAPAkACwAdCQALAB4KAAwAHwoAIAAhBwAiCwAFACUKACYAJwoAJgAoBwApCgALACoHACsHACwHAC0BAA12YWwkbGFieXJpbnRoAQAcTHBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoOwEABnRoaXMkMAEAJExwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uOwEABjxpbml0PgEAQyhMcG9zMV8yYWhpZi90ZXN0Mi9SZWZlcmVuY2VTb2x1dGlvbjtMcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGg7KVYBAARDb2RlAQAHY29tcGFyZQEAPShMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvQ29vcmRzO0xwb3MxXzJhaGlmL3Rlc3QyL2FwaS9Db29yZHM7KUkBACcoTGphdmEvbGFuZy9PYmplY3Q7TGphdmEvbGFuZy9PYmplY3Q7KUkBAAlTaWduYXR1cmUBAEdMamF2YS9sYW5nL09iamVjdDtMamF2YS91dGlsL0NvbXBhcmF0b3I8THBvczFfMmFoaWYvdGVzdDIvYXBpL0Nvb3Jkczs+OwEAD0VuY2xvc2luZ01ldGhvZAcALgwALwAwDAAQABEMAA4ADwwAEgAxBwAyDAAzADQBACNwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aCRUcmVhc3VyZQEACFRyZWFzdXJlAQAMSW5uZXJDbGFzc2VzDAA1ADYHADcMADgAOQwAOgA7AQAbcG9zMV8yYWhpZi90ZXN0Mi9hcGkvQ29vcmRzDAAVABYBACRwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uJDEBABBqYXZhL2xhbmcvT2JqZWN0AQAUamF2YS91dGlsL0NvbXBhcmF0b3IBACJwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uAQAaZ2V0VHJlYXN1cmVzT3JkZXJlZEJ5VmFsdWUBAC4oTHBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoOylMamF2YS91dGlsL0xpc3Q7AQADKClWAQAacG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGgBAANnZXQBAC8oTGphdmEvbGFuZy9PYmplY3Q7KUxwb3MxXzJhaGlmL3Rlc3QyL2FwaS9UaWxlOwEACGdldFZhbHVlAQADKClGAQAPamF2YS9sYW5nL0Zsb2F0AQAHdmFsdWVPZgEAFChGKUxqYXZhL2xhbmcvRmxvYXQ7AQAJY29tcGFyZVRvAQAUKExqYXZhL2xhbmcvRmxvYXQ7KUkAIAALAAwAAQANAAIQEAAOAA8AABAQABAAEQAAAAMAAAASABMAAQAUAAAAGwACAAMAAAAPKiu1AAEqLLUAAiq3AAOxAAAAAAABABUAFgABABQAAAA9AAIABQAAADEqtAACK7YABMAABU4qtAACLLYABMAABToELbkABgEAuAAHGQS5AAYBALgAB7YACHSsAAAAABBBABUAFwABABQAAAAZAAMAAwAAAA0qK8AACSzAAAm2AAqsAAAAAAADABgAAAACABkAGgAAAAQAGwAcACQAAAASAAIABQAgACMGCQALAAAAAAAA"), 0, 1233, (CodeSource) null);
            this.defineClass("pos1_2ahif.test2.ReferenceSolution$2", DatatypeConverter.parseBase64Binary("yv66vgAAADIAPwkADAAeCQAMAB8KAA0AIAoAIQAiBwAjCwAFACYLAAUAJwoAKAApCgAoACoHACsKAAwALAcALQcALgcALwEADXZhbCRsYWJ5cmludGgBABxMcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGg7AQAGdGhpcyQwAQAkTHBvczFfMmFoaWYvdGVzdDIvUmVmZXJlbmNlU29sdXRpb247AQAGPGluaXQ+AQBDKExwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uO0xwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aDspVgEABENvZGUBAAdjb21wYXJlAQA9KExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9Db29yZHM7THBvczFfMmFoaWYvdGVzdDIvYXBpL0Nvb3JkczspSQEAJyhMamF2YS9sYW5nL09iamVjdDtMamF2YS9sYW5nL09iamVjdDspSQEACVNpZ25hdHVyZQEAR0xqYXZhL2xhbmcvT2JqZWN0O0xqYXZhL3V0aWwvQ29tcGFyYXRvcjxMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvQ29vcmRzOz47AQAPRW5jbG9zaW5nTWV0aG9kBwAwDAAxADIMABEAEgwADwAQDAATADMHADQMADUANgEAI3BvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoJFRyZWFzdXJlAQAIVHJlYXN1cmUBAAxJbm5lckNsYXNzZXMMADcAOAwAOQA4BwA6DAA7ADwMAD0APgEAG3BvczFfMmFoaWYvdGVzdDIvYXBpL0Nvb3JkcwwAFgAXAQAkcG9zMV8yYWhpZi90ZXN0Mi9SZWZlcmVuY2VTb2x1dGlvbiQyAQAQamF2YS9sYW5nL09iamVjdAEAFGphdmEvdXRpbC9Db21wYXJhdG9yAQAicG9zMV8yYWhpZi90ZXN0Mi9SZWZlcmVuY2VTb2x1dGlvbgEAI2dldFRyZWFzdXJlc09yZGVyZWRCeVZhbHVlUGVyV2VpZ2h0AQAuKExwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aDspTGphdmEvdXRpbC9MaXN0OwEAAygpVgEAGnBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoAQADZ2V0AQAvKExqYXZhL2xhbmcvT2JqZWN0OylMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvVGlsZTsBAAhnZXRWYWx1ZQEAAygpRgEACWdldFdlaWdodAEAD2phdmEvbGFuZy9GbG9hdAEAB3ZhbHVlT2YBABQoRilMamF2YS9sYW5nL0Zsb2F0OwEACWNvbXBhcmVUbwEAFChMamF2YS9sYW5nL0Zsb2F0OylJACAADAANAAEADgACEBAADwAQAAAQEAARABIAAAADAAAAEwAUAAEAFQAAABsAAgADAAAADyortQABKiy1AAIqtwADsQAAAAAAAQAWABcAAQAVAAAATAADAAUAAABAKrQAAiu2AATAAAVOKrQAAiy2AATAAAU6BC25AAYBAC25AAcBAG64AAgZBLkABgEAGQS5AAcBAG64AAi2AAl0rAAAAAAQQQAWABgAAQAVAAAAGQADAAMAAAANKivAAAoswAAKtgALrAAAAAAAAwAZAAAAAgAaABsAAAAEABwAHQAlAAAAEgACAAUAIQAkBgkADAAAAAAAAA=="), 0, 1279, (CodeSource) null);
            this.defineClass("pos1_2ahif.test2.ReferenceSolution$MyPassage", DatatypeConverter.parseBase64Binary("yv66vgAAADIAHAoABAAPCQADABAHABIHABUHABcBAAZvcGVuZWQBAAFaAQAGPGluaXQ+AQAEKFopVgEABENvZGUBAAZpc09wZW4BAAMoKVoBAAhpc09wZW5lZAEACXNldE9wZW5lZAwACAAZDAAGAAcHABoBACxwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uJE15UGFzc2FnZQEACU15UGFzc2FnZQEADElubmVyQ2xhc3NlcwEAEGphdmEvbGFuZy9PYmplY3QHABsBACJwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aCRQYXNzYWdlAQAHUGFzc2FnZQEAAygpVgEAInBvczFfMmFoaWYvdGVzdDIvUmVmZXJlbmNlU29sdXRpb24BABpwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aAAgAAMABAABAAUAAQABAAYABwAAAAQAAQAIAAkAAQAKAAAAFgACAAIAAAAKKrcAASobtQACsQAAAAAAAQALAAwAAQAKAAAADgABAAEAAAACBKwAAAAAAAEADQAMAAEACgAAABEAAQABAAAABSq0AAKsAAAAAAABAA4ACQABAAoAAAASAAIAAgAAAAYqG7UAArEAAAAAAAEAFAAAABIAAgADABEAEwAKAAUAFgAYBgk="), 0, 506, (CodeSource) null);
            this.defineClass("pos1_2ahif.test2.ReferenceSolution$MyTile", DatatypeConverter.parseBase64Binary("yv66vgAAADIAMgoACgAbCQAJABwJAAkAHQkACQAeCgAfACAHACIKAAYAJAoACgAlBwAmBwAoAQAIb3JpZ2luYWwBABtMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvVGlsZTsBAARvcGVuAQAgTHBvczFfMmFoaWYvdGVzdDIvYXBpL0RpcmVjdGlvbjsBAAhpbml0T3BlbgEAAVoBAAY8aW5pdD4BAD8oTHBvczFfMmFoaWYvdGVzdDIvYXBpL1RpbGU7THBvczFfMmFoaWYvdGVzdDIvYXBpL0RpcmVjdGlvbjtaKVYBAARDb2RlAQAMZ2V0RGlyZWN0aW9uBwAqAQAHUGFzc2FnZQEADElubmVyQ2xhc3NlcwEARihMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvRGlyZWN0aW9uOylMcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGgkUGFzc2FnZTsBAA1TdGFja01hcFRhYmxlBwAqDAARACsMAAsADAwADQAODAAPABAHACwMAC0ALgcALwEALHBvczFfMmFoaWYvdGVzdDIvUmVmZXJlbmNlU29sdXRpb24kTXlQYXNzYWdlAQAJTXlQYXNzYWdlDAARADAMABQAGAEAKXBvczFfMmFoaWYvdGVzdDIvUmVmZXJlbmNlU29sdXRpb24kTXlUaWxlAQAGTXlUaWxlAQAZcG9zMV8yYWhpZi90ZXN0Mi9hcGkvVGlsZQcAMQEAInBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoJFBhc3NhZ2UBAAMoKVYBAB5wb3MxXzJhaGlmL3Rlc3QyL2FwaS9EaXJlY3Rpb24BAAZlcXVhbHMBABUoTGphdmEvbGFuZy9PYmplY3Q7KVoBACJwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uAQAEKFopVgEAGnBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoACAACQAKAAAAAwASAAsADAAAABIADQAOAAAAEgAPABAAAAACAAEAEQASAAEAEwAAACAAAgAEAAAAFCq3AAEqK7UAAiostQADKh21AASxAAAAAAABABQAGAABABMAAAA7AAMAAgAAACIrKrQAA7YABZkAEbsABlkqtAAEtwAHpwALKrQAAiu2AAiwAAAAAQAZAAAABwACGUcHABoAAQAXAAAAGgADABUAKQAWBgkABgAhACMACgAJACEAJwAK"), 0, 924, (CodeSource) null);
            this.defineClass("pos1_2ahif.test2.ReferenceSolution", DatatypeConverter.parseBase64Binary("yv66vgAAADIA5QoALgBkCABlCgBmAGcLAGgAaQsAagBrCwBqAGwHAG0HAG4HAHAKAAkAZAoAZgBxCwByAGkHAHQLAA0AdgsADQB3CwAmAHgKAD4AeQcAegoAEgB7CgB8AH0HAH4KABUAewcAfwoAFwCACwAmAGkHAIEKAGYAggoABwCDCwCEAIUHAIYKAB4AZAcAhwoAIACICgAeAIkKABcAigoAGgCLCgBmAIwHAI0LACYAjgcAjwcAkAoAKQCRCgAoAJIHAJMIAJUHAJYLAAgAlwoAmACZCgAoAJoKACAAgwcAmwoAMwCcCACdCgAoAJ4KADMAnwoAGgCgCgAoAKEKAGYAogoAKACjBwCkCgA8AKUHAKYHAKcBAAZNeVRpbGUBAAxJbm5lckNsYXNzZXMBAAlNeVBhc3NhZ2UBAAY8aW5pdD4BAAMoKVYBAARDb2RlAQAJZ2V0TXlOYW1lAQAUKClMamF2YS9sYW5nL1N0cmluZzsBABRnZXRNeUV4YW1BY2NvdW50TmFtZQEADmhhc0FueVRyZWFzdXJlAQAfKExwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aDspWgEADVN0YWNrTWFwVGFibGUHAKgBABRnZXRBbGxUcmVhc3VyZUNvb3JkcwEALihMcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGg7KUxqYXZhL3V0aWwvTGlzdDsHAI0BAAlTaWduYXR1cmUBAE0oTHBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoOylMamF2YS91dGlsL0xpc3Q8THBvczFfMmFoaWYvdGVzdDIvYXBpL0Nvb3Jkczs+OwEAGmdldFRyZWFzdXJlc09yZGVyZWRCeVZhbHVlAQAjZ2V0VHJlYXN1cmVzT3JkZXJlZEJ5VmFsdWVQZXJXZWlnaHQBABZjbGVhclBhc3NhZ2VzQWxvbmdQYXRoAQAvKExwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aDtMamF2YS91dGlsL0xpc3Q7KVYHAH8HAIEBAFEoTHBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoO0xqYXZhL3V0aWwvTGlzdDxMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvRGlyZWN0aW9uOz47KVYBAAlqb2luUGF0aHMBACIoTGphdmEvdXRpbC9MaXN0OylMamF2YS91dGlsL0xpc3Q7AQB4KExqYXZhL3V0aWwvTGlzdDxMamF2YS91dGlsL0xpc3Q8THBvczFfMmFoaWYvdGVzdDIvYXBpL0RpcmVjdGlvbjs+Oz47KUxqYXZhL3V0aWwvTGlzdDxMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvRGlyZWN0aW9uOz47AQAYcHJpbnRQbGFuRm9yVHJlYXN1cmVIdW50AQA9KExwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aDtMamF2YS91dGlsL0xpc3Q7TGphdmEvaW8vRmlsZTspVgcAjwcApgcAqQcAqgcApAEAXyhMcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGg7TGphdmEvdXRpbC9MaXN0PExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9EaXJlY3Rpb247PjtMamF2YS9pby9GaWxlOylWDABDAEQBABJSZWZlcmVuY2UgU29sdXRpb24HAKkMAKsArAcArQwArgCvBwCoDACwALEMALIAswEAGXBvczFfMmFoaWYvdGVzdDIvYXBpL1RpbGUBACNwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aCRUcmVhc3VyZQEACFRyZWFzdXJlAQATamF2YS91dGlsL0FycmF5TGlzdAwAtAC1BwC2BwC3AQATamF2YS91dGlsL01hcCRFbnRyeQEABUVudHJ5DAC4ALMMALkAswwAugC7DABNAE4BACRwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uJDEMAEMAvAcAvQwAvgC/AQAkcG9zMV8yYWhpZi90ZXN0Mi9SZWZlcmVuY2VTb2x1dGlvbiQyAQAbcG9zMV8yYWhpZi90ZXN0Mi9hcGkvQ29vcmRzDABDAMABAB5wb3MxXzJhaGlmL3Rlc3QyL2FwaS9EaXJlY3Rpb24MAMEAwgwAwwDFBwDGDADHALEBABFqYXZhL3V0aWwvSGFzaE1hcAEAKXBvczFfMmFoaWYvdGVzdDIvUmVmZXJlbmNlU29sdXRpb24kTXlUaWxlDABDAMgMAMkAygwAywDMDADNAM4MAM8A0AEADmphdmEvdXRpbC9MaXN0DADRANIBABNqYXZhL2lvL1ByaW50V3JpdGVyAQAYamF2YS9pby9GaWxlT3V0cHV0U3RyZWFtDABDANMMAEMA1AEALHBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoJENvbGxlY3RlZFRyZWFzdXJlAQARQ29sbGVjdGVkVHJlYXN1cmUBABBGZXR0ZSBCZXV0ZTogJWYKAQAQamF2YS9sYW5nL09iamVjdAwAuADVBwDWDADXANgMANkA2gEALHBvczFfMmFoaWYvdGVzdDIvUmVmZXJlbmNlU29sdXRpb24kTXlQYXNzYWdlDADbALEBAAdLYWJvb20hDADcAN0MAN4A3wwA4ABHDADhAN0MAOAA4gwA4wBEAQAdamF2YS9pby9GaWxlTm90Rm91bmRFeGNlcHRpb24MAOQARAEAInBvczFfMmFoaWYvdGVzdDIvUmVmZXJlbmNlU29sdXRpb24BAB5wb3MxXzJhaGlmL3Rlc3QyL2FwaS9FeGVyY2lzZXMBABJqYXZhL3V0aWwvSXRlcmF0b3IBABpwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aAEADGphdmEvaW8vRmlsZQEABnZhbHVlcwEAGCgpTGphdmEvdXRpbC9Db2xsZWN0aW9uOwEAFGphdmEvdXRpbC9Db2xsZWN0aW9uAQAIaXRlcmF0b3IBABYoKUxqYXZhL3V0aWwvSXRlcmF0b3I7AQAHaGFzTmV4dAEAAygpWgEABG5leHQBABQoKUxqYXZhL2xhbmcvT2JqZWN0OwEACGVudHJ5U2V0AQARKClMamF2YS91dGlsL1NldDsBAA1qYXZhL3V0aWwvU2V0AQANamF2YS91dGlsL01hcAEACGdldFZhbHVlAQAGZ2V0S2V5AQADYWRkAQAVKExqYXZhL2xhbmcvT2JqZWN0OylaAQBDKExwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uO0xwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aDspVgEAFWphdmEvdXRpbC9Db2xsZWN0aW9ucwEABHNvcnQBACkoTGphdmEvdXRpbC9MaXN0O0xqYXZhL3V0aWwvQ29tcGFyYXRvcjspVgEABShJSSlWAQADZ2V0AQAvKExqYXZhL2xhbmcvT2JqZWN0OylMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvVGlsZTsBAAxnZXREaXJlY3Rpb24BAAdQYXNzYWdlAQBGKExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9EaXJlY3Rpb247KUxwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aCRQYXNzYWdlOwEAInBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoJFBhc3NhZ2UBAAZpc09wZW4BAD8oTHBvczFfMmFoaWYvdGVzdDIvYXBpL1RpbGU7THBvczFfMmFoaWYvdGVzdDIvYXBpL0RpcmVjdGlvbjtaKVYBAANwdXQBADgoTGphdmEvbGFuZy9PYmplY3Q7TGphdmEvbGFuZy9PYmplY3Q7KUxqYXZhL2xhbmcvT2JqZWN0OwEAAmdvAQA/KExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9EaXJlY3Rpb247KUxwb3MxXzJhaGlmL3Rlc3QyL2FwaS9Db29yZHM7AQAUZ2V0T3Bwb3NpdGVEaXJlY3Rpb24BACIoKUxwb3MxXzJhaGlmL3Rlc3QyL2FwaS9EaXJlY3Rpb247AQANY2xlYXJQYXNzYWdlcwEAEihMamF2YS91dGlsL01hcDspVgEABmFkZEFsbAEAGShMamF2YS91dGlsL0NvbGxlY3Rpb247KVoBABEoTGphdmEvaW8vRmlsZTspVgEAGShMamF2YS9pby9PdXRwdXRTdHJlYW07KVYBAAMoKUYBAA9qYXZhL2xhbmcvRmxvYXQBAAd2YWx1ZU9mAQAUKEYpTGphdmEvbGFuZy9GbG9hdDsBAAZwcmludGYBADwoTGphdmEvbGFuZy9TdHJpbmc7W0xqYXZhL2xhbmcvT2JqZWN0OylMamF2YS9pby9QcmludFdyaXRlcjsBAAhpc09wZW5lZAEABXByaW50AQAVKExqYXZhL2xhbmcvU3RyaW5nOylWAQAJc2V0T3BlbmVkAQAEKFopVgEACHRvU3RyaW5nAQAHcHJpbnRsbgEAJChMamF2YS91dGlsL0xpc3Q7KUxqYXZhL2xhbmcvU3RyaW5nOwEABWZsdXNoAQAPcHJpbnRTdGFja1RyYWNlACEAPgAuAAEAPwAAAAoAAQBDAEQAAQBFAAAAEQABAAEAAAAFKrcAAbEAAAAAAAEARgBHAAEARQAAAA8AAQABAAAAAxICsAAAAAAAAQBIAEcAAQBFAAAADwABAAEAAAADEgKwAAAAAAABAEkASgABAEUAAABJAAEABAAAACsrtgADuQAEAQBNLLkABQEAmQAZLLkABgEAwAAHTi3BAAiZAAUErKf/5AOsAAAAAQBLAAAADAAD/AAKBwBMG/oAAgACAE0ATgACAEUAAABnAAIABQAAAEa7AAlZtwAKTSu2AAu5AAwBAE4tuQAFAQCZACwtuQAGAQDAAA06BBkEuQAOAQDBAAiZABEsGQS5AA8BALkAEAIAV6f/0SywAAAAAQBLAAAADwAD/QASBwBPBwBMLvoAAgBQAAAAAgBRAAEAUgBOAAIARQAAACEABQADAAAAFSortwARTSy7ABJZKiu3ABO4ABQssAAAAAAAUAAAAAIAUQABAFMATgACAEUAAAAhAAUAAwAAABUqK7cAEU0suwAVWSortwAWuAAULLAAAAAAAFAAAAACAFEAAQBUAFUAAgBFAAAAswAHAAcAAACNuwAXWQMDtwAYTiy5ABkBADoEGQS5AAUBAJkAcxkEuQAGAQDAABo6BSsttgAbGQW2ABy5AB0BAJoAS7sAHlm3AB86BhkGLbsAIFkrLbYAGxkFA7cAIbYAIlcZBi0ZBbYAI7sAIFkrLRkFtgAjtgAbGQW2ACQEtwAhtgAiVysZBrYAJS0ZBbYAI06n/4mxAAAAAQBLAAAAFAAD/QASBwBWBwBM/ABvBwBX+QAJAFAAAAACAFgAAQBZAFoAAgBFAAAAUQACAAUAAAAxuwAJWbcACk0ruQAZAQBOLbkABQEAmQAaLbkABgEAwAAmOgQsGQS5ACcCAFen/+MssAAAAAEASwAAAA4AAv0ADwcATwcATPoAHwBQAAAAAgBbAAEAXABdAAIARQAAASYABwAKAAAA27sAKFm7AClZLbcAKrcAKzoEuwAXWQMDtwAYOgUsuQAZAQA6BhkGuQAFAQCZAJYZBrkABgEAwAAaOgcrGQW2ABvBACyZACMZBBItBL0ALlkDKxkFtgAbwAAIuQAvAQC4ADBTtgAxVysZBbYAG8EAIJkAPCsZBbYAG8AAIDoIGQgZB7YAMsEAM5kAJBkIGQe2ADLAADM6CRkJtgA0mgAQGQQSNbYANhkJBLYANxkEGQe2ADi2ADkZBRkHtgAjOgWn/2YZBCsstgA6tgA5GQS2ADunAAo6BBkEtgA9sQABAAAA0ADTADwAAQBLAAAAMQAG/gAkBwBeBwBWBwBM/ABBBwBX+wBE+QAV/wARAAQHAF8HAGAHAE8HAGEAAQcAYgYAUAAAAAIAYwABAEEAAABCAAgAIAA+AEAACgAzAD4AQgAKABUAAAAAAAAAEgAAAAAAAAAIAGYAbwYJAA0AcwB1BgkALABmAJQGCQCEAGYAxAYJ"), 0, 4578, (CodeSource) null);
        }
    }

    private static Passage pass(int i) {
        if (i == 0) {
            return new Passage() {
                @Override
                public boolean isOpen() {
                    return false;
                }
            };
        } else {
            return new Passage() {
                @Override
                public boolean isOpen() {
                    return true;
                }
            };
        }
    }

    private static Tile t(int left, int right, int up, int down) {
        final Passage l = pass(left), r = pass(right), u = pass(up), d = pass(down);
        return new Tile() {
            @Override
            public Labyrinth.Passage getLeft() {
                return l;
            }

            @Override
            public Labyrinth.Passage getRight() {
                return r;
            }

            @Override
            public Labyrinth.Passage getUp() {
                return u;
            }

            @Override
            public Labyrinth.Passage getDown() {
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
        public Passage getDirection(Direction direction) {
            return tile.getDirection(direction);
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

        labs.put("l5x5-no-treasure", new Labyrinth(new HashMap<Coords, Tile>() {{
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

        labs.put("l10x10-treasure-4-8-and-3-1", new Labyrinth(new HashMap<Coords, Tile>() {{
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

        labs.put("l35x15-treasure-4-8--3-1--13-1--2-1--1-1-and-1-7", new Labyrinth(new HashMap<Coords, Tile>() {{
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
            put(c(32, 3), t(1, 1, 1, 1, 4.0f, 8.0f));
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
