package pos1_2ahif.test2;

import pos1_2ahif.test2.Labyrinth.Coords;
import pos1_2ahif.test2.Labyrinth.Passage;
import pos1_2ahif.test2.Labyrinth.Tile;
import pos1_2ahif.test2.Labyrinth.Treasure;

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

            this.defineClass("pos1_2ahif.test2.ReferenceSolution$1", DatatypeConverter.parseBase64Binary("yv66vgAAADIAQAkACwAfCQALACAKAAwAIQoAIgAjBwAkCwAFACYKACcAKAoAJwApBwAqCgALACsHACwHAC0HAC4BAA12YWwkbGFieXJpbnRoAQAcTHBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoOwEABnRoaXMkMAEAJExwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uOwEABjxpbml0PgEAQyhMcG9zMV8yYWhpZi90ZXN0Mi9SZWZlcmVuY2VTb2x1dGlvbjtMcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGg7KVYBAARDb2RlAQAHY29tcGFyZQEABkNvb3JkcwEADElubmVyQ2xhc3NlcwEASShMcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGgkQ29vcmRzO0xwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aCRDb29yZHM7KUkBACcoTGphdmEvbGFuZy9PYmplY3Q7TGphdmEvbGFuZy9PYmplY3Q7KUkBAAlTaWduYXR1cmUBAE1MamF2YS9sYW5nL09iamVjdDtMamF2YS91dGlsL0NvbXBhcmF0b3I8THBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoJENvb3Jkczs+OwEAD0VuY2xvc2luZ01ldGhvZAcALwwAMAAxDAAQABEMAA4ADwwAEgAyBwAzDAA0ADcBACNwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aCRUcmVhc3VyZQEACFRyZWFzdXJlDAA4ADkHADoMADsAPAwAPQA+AQAhcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGgkQ29vcmRzDAAVABgBACRwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uJDEBABBqYXZhL2xhbmcvT2JqZWN0AQAUamF2YS91dGlsL0NvbXBhcmF0b3IBACJwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uAQAaZ2V0VHJlYXN1cmVzT3JkZXJlZEJ5VmFsdWUBAC4oTHBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoOylMamF2YS91dGlsL0xpc3Q7AQADKClWAQAacG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGgBAANnZXQHAD8BAARUaWxlAQA1KExqYXZhL2xhbmcvT2JqZWN0OylMcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGgkVGlsZTsBAAhnZXRWYWx1ZQEAAygpRgEAD2phdmEvbGFuZy9GbG9hdAEAB3ZhbHVlT2YBABQoRilMamF2YS9sYW5nL0Zsb2F0OwEACWNvbXBhcmVUbwEAFChMamF2YS9sYW5nL0Zsb2F0OylJAQAfcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGgkVGlsZQAgAAsADAABAA0AAhAQAA4ADwAAEBAAEAARAAAAAwAAABIAEwABABQAAAAbAAIAAwAAAA8qK7UAASostQACKrcAA7EAAAAAAAEAFQAYAAEAFAAAAD0AAgAFAAAAMSq0AAIrtgAEwAAFTiq0AAIstgAEwAAFOgQtuQAGAQC4AAcZBLkABgEAuAAHtgAIdKwAAAAAEEEAFQAZAAEAFAAAABkAAwADAAAADSorwAAJLMAACbYACqwAAAAAAAMAGgAAAAIAGwAcAAAABAAdAB4AFwAAACIABAAJACIAFgAZAAUAIgAlBgkACwAAAAAAAAA1ACIANgQJ"), 0, 1332, (CodeSource) null);
            this.defineClass("pos1_2ahif.test2.ReferenceSolution$2", DatatypeConverter.parseBase64Binary("yv66vgAAADIAQwkADAAgCQAMACEKAA0AIgoAIwAkBwAlCwAFACcLAAUAKAoAKQAqCgApACsHACwKAAwALQcALgcALwcAMAEADXZhbCRsYWJ5cmludGgBABxMcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGg7AQAGdGhpcyQwAQAkTHBvczFfMmFoaWYvdGVzdDIvUmVmZXJlbmNlU29sdXRpb247AQAGPGluaXQ+AQBDKExwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uO0xwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aDspVgEABENvZGUBAAdjb21wYXJlAQAGQ29vcmRzAQAMSW5uZXJDbGFzc2VzAQBJKExwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aCRDb29yZHM7THBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoJENvb3JkczspSQEAJyhMamF2YS9sYW5nL09iamVjdDtMamF2YS9sYW5nL09iamVjdDspSQEACVNpZ25hdHVyZQEATUxqYXZhL2xhbmcvT2JqZWN0O0xqYXZhL3V0aWwvQ29tcGFyYXRvcjxMcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGgkQ29vcmRzOz47AQAPRW5jbG9zaW5nTWV0aG9kBwAxDAAyADMMABEAEgwADwAQDAATADQHADUMADYAOQEAI3BvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoJFRyZWFzdXJlAQAIVHJlYXN1cmUMADoAOwwAPAA7BwA9DAA+AD8MAEAAQQEAIXBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoJENvb3JkcwwAFgAZAQAkcG9zMV8yYWhpZi90ZXN0Mi9SZWZlcmVuY2VTb2x1dGlvbiQyAQAQamF2YS9sYW5nL09iamVjdAEAFGphdmEvdXRpbC9Db21wYXJhdG9yAQAicG9zMV8yYWhpZi90ZXN0Mi9SZWZlcmVuY2VTb2x1dGlvbgEAI2dldFRyZWFzdXJlc09yZGVyZWRCeVZhbHVlUGVyV2VpZ2h0AQAuKExwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aDspTGphdmEvdXRpbC9MaXN0OwEAAygpVgEAGnBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoAQADZ2V0BwBCAQAEVGlsZQEANShMamF2YS9sYW5nL09iamVjdDspTHBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoJFRpbGU7AQAIZ2V0VmFsdWUBAAMoKUYBAAlnZXRXZWlnaHQBAA9qYXZhL2xhbmcvRmxvYXQBAAd2YWx1ZU9mAQAUKEYpTGphdmEvbGFuZy9GbG9hdDsBAAljb21wYXJlVG8BABQoTGphdmEvbGFuZy9GbG9hdDspSQEAH3BvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoJFRpbGUAIAAMAA0AAQAOAAIQEAAPABAAABAQABEAEgAAAAMAAAATABQAAQAVAAAAGwACAAMAAAAPKiu1AAEqLLUAAiq3AAOxAAAAAAABABYAGQABABUAAABMAAMABQAAAEAqtAACK7YABMAABU4qtAACLLYABMAABToELbkABgEALbkABwEAbrgACBkEuQAGAQAZBLkABwEAbrgACLYACXSsAAAAABBBABYAGgABABUAAAAZAAMAAwAAAA0qK8AACizAAAq2AAusAAAAAAADABsAAAACABwAHQAAAAQAHgAfABgAAAAiAAQACgAjABcAGQAFACMAJgYJAAwAAAAAAAAANwAjADgECQ=="), 0, 1378, (CodeSource) null);
            this.defineClass("pos1_2ahif.test2.ReferenceSolution$MyPassage", DatatypeConverter.parseBase64Binary("yv66vgAAADIAHAoABAAPCQADABAHABIHABUHABcBAAZvcGVuZWQBAAFaAQAGPGluaXQ+AQAEKFopVgEABENvZGUBAAZpc09wZW4BAAMoKVoBAAhpc09wZW5lZAEACXNldE9wZW5lZAwACAAZDAAGAAcHABoBACxwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uJE15UGFzc2FnZQEACU15UGFzc2FnZQEADElubmVyQ2xhc3NlcwEAEGphdmEvbGFuZy9PYmplY3QHABsBACJwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aCRQYXNzYWdlAQAHUGFzc2FnZQEAAygpVgEAInBvczFfMmFoaWYvdGVzdDIvUmVmZXJlbmNlU29sdXRpb24BABpwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aAAgAAMABAABAAUAAQABAAYABwAAAAQAAQAIAAkAAQAKAAAAFgACAAIAAAAKKrcAASobtQACsQAAAAAAAQALAAwAAQAKAAAADgABAAEAAAACBKwAAAAAAAEADQAMAAEACgAAABEAAQABAAAABSq0AAKsAAAAAAABAA4ACQABAAoAAAASAAIAAgAAAAYqG7UAArEAAAAAAAEAFAAAABIAAgADABEAEwAKAAUAFgAYBgk="), 0, 506, (CodeSource) null);
            this.defineClass("pos1_2ahif.test2.ReferenceSolution$MyTile", DatatypeConverter.parseBase64Binary("yv66vgAAADIANAoACgAeCQAJAB8JAAkAIAkACQAhCgAQACIHACQKAAYAJgoACgAnBwAoBwArAQAIb3JpZ2luYWwBAARUaWxlAQAMSW5uZXJDbGFzc2VzAQAhTHBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoJFRpbGU7AQAEb3BlbgcALAEACURpcmVjdGlvbgEAJkxwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aCREaXJlY3Rpb247AQAIaW5pdE9wZW4BAAFaAQAGPGluaXQ+AQBLKExwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aCRUaWxlO0xwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aCREaXJlY3Rpb247WilWAQAEQ29kZQEADGdldERpcmVjdGlvbgcALQEAB1Bhc3NhZ2UBAEwoTHBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoJERpcmVjdGlvbjspTHBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoJFBhc3NhZ2U7AQANU3RhY2tNYXBUYWJsZQcALQwAFQAuDAALAA4MAA8AEgwAEwAUDAAvADAHADEBACxwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uJE15UGFzc2FnZQEACU15UGFzc2FnZQwAFQAyDAAYABsBAClwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uJE15VGlsZQEABk15VGlsZQcAMwEAH3BvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoJFRpbGUBACRwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aCREaXJlY3Rpb24BACJwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aCRQYXNzYWdlAQADKClWAQAGZXF1YWxzAQAVKExqYXZhL2xhbmcvT2JqZWN0OylaAQAicG9zMV8yYWhpZi90ZXN0Mi9SZWZlcmVuY2VTb2x1dGlvbgEABChaKVYBABpwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aAAgAAkACgAAAAMAEgALAA4AAAASAA8AEgAAABIAEwAUAAAAAgABABUAFgABABcAAAAgAAIABAAAABQqtwABKiu1AAIqLLUAAyodtQAEsQAAAAAAAQAYABsAAQAXAAAAOwADAAIAAAAiKyq0AAO2AAWZABG7AAZZKrQABLcAB6cACyq0AAIrtgAIsAAAAAEAHAAAAAcAAhlHBwAdAAEADQAAACoABQAKACoADAQJABAAKgARBAkAGQAqABoGCQAGACMAJQAKAAkAIwApAAo="), 0, 1001, (CodeSource) null);
            this.defineClass("pos1_2ahif.test2.ReferenceSolution", DatatypeConverter.parseBase64Binary("yv66vgAAADIA6AoALgBmCABnCgBoAGkLAGoAawsAbABtCwBsAG4HAG8HAHEHAHMKAAkAZgoAaAB0CwB1AGsHAHcLAA0AeQsADQB6CwAmAHsKAD4AfAcAfQoAEgB+CgB/AIAHAIEKABUAfgcAggoAFwCDCwAmAGsHAIQKAGgAhQoABwCGCwCHAIgHAIkKAB4AZgcAigoAIACLCgAeAIwKABcAjQoAGgCOCgBoAI8HAJALACYAkQcAkgcAkwoAKQCUCgAoAJUHAJYIAJgHAJkLAAgAmgoAmwCcCgAoAJ0KACAAhgcAngoAMwCfCACgCgAoAKEKADMAogoAGgCjCgAoAKQKAGgApQoAKACmBwCnCgA8AKgHAKkHAKoBAAZNeVRpbGUBAAxJbm5lckNsYXNzZXMBAAlNeVBhc3NhZ2UBAAY8aW5pdD4BAAMoKVYBAARDb2RlAQAJZ2V0TXlOYW1lAQAUKClMamF2YS9sYW5nL1N0cmluZzsBABRnZXRNeUV4YW1BY2NvdW50TmFtZQEADmhhc0FueVRyZWFzdXJlAQAfKExwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aDspWgEADVN0YWNrTWFwVGFibGUHAKsBABRnZXRBbGxUcmVhc3VyZUNvb3JkcwEALihMcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGg7KUxqYXZhL3V0aWwvTGlzdDsHAJABAAlTaWduYXR1cmUBAAZDb29yZHMBAFMoTHBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoOylMamF2YS91dGlsL0xpc3Q8THBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoJENvb3Jkczs+OwEAGmdldFRyZWFzdXJlc09yZGVyZWRCeVZhbHVlAQAjZ2V0VHJlYXN1cmVzT3JkZXJlZEJ5VmFsdWVQZXJXZWlnaHQBABZjbGVhclBhc3NhZ2VzQWxvbmdQYXRoAQAvKExwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aDtMamF2YS91dGlsL0xpc3Q7KVYHAIIHAIQBAAlEaXJlY3Rpb24BAFcoTHBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoO0xqYXZhL3V0aWwvTGlzdDxMcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGgkRGlyZWN0aW9uOz47KVYBAAlqb2luUGF0aHMBACIoTGphdmEvdXRpbC9MaXN0OylMamF2YS91dGlsL0xpc3Q7AQCEKExqYXZhL3V0aWwvTGlzdDxMamF2YS91dGlsL0xpc3Q8THBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoJERpcmVjdGlvbjs+Oz47KUxqYXZhL3V0aWwvTGlzdDxMcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGgkRGlyZWN0aW9uOz47AQAYcHJpbnRQbGFuRm9yVHJlYXN1cmVIdW50AQA9KExwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aDtMamF2YS91dGlsL0xpc3Q7TGphdmEvaW8vRmlsZTspVgcAkgcAqQcArAcArQcApwEAZShMcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGg7TGphdmEvdXRpbC9MaXN0PExwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aCREaXJlY3Rpb247PjtMamF2YS9pby9GaWxlOylWDABDAEQBABJSZWZlcmVuY2UgU29sdXRpb24HAKwMAK4ArwcAsAwAsQCyBwCrDACzALQMALUAtgEAH3BvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoJFRpbGUBAARUaWxlAQAjcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGgkVHJlYXN1cmUBAAhUcmVhc3VyZQEAE2phdmEvdXRpbC9BcnJheUxpc3QMALcAuAcAuQcAugEAE2phdmEvdXRpbC9NYXAkRW50cnkBAAVFbnRyeQwAuwC2DAC8ALYMAL0AvgwATQBOAQAkcG9zMV8yYWhpZi90ZXN0Mi9SZWZlcmVuY2VTb2x1dGlvbiQxDABDAL8HAMAMAMEAwgEAJHBvczFfMmFoaWYvdGVzdDIvUmVmZXJlbmNlU29sdXRpb24kMgEAIXBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoJENvb3JkcwwAQwDDAQAkcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGgkRGlyZWN0aW9uDADEAMUMAMYAyAcAyQwAygC0AQARamF2YS91dGlsL0hhc2hNYXABAClwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uJE15VGlsZQwAQwDLDADMAM0MAM4AzwwA0ADRDADSANMBAA5qYXZhL3V0aWwvTGlzdAwA1ADVAQATamF2YS9pby9QcmludFdyaXRlcgEAGGphdmEvaW8vRmlsZU91dHB1dFN0cmVhbQwAQwDWDABDANcBACxwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aCRDb2xsZWN0ZWRUcmVhc3VyZQEAEUNvbGxlY3RlZFRyZWFzdXJlAQAQRmV0dGUgQmV1dGU6ICVmCgEAEGphdmEvbGFuZy9PYmplY3QMALsA2AcA2QwA2gDbDADcAN0BACxwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uJE15UGFzc2FnZQwA3gC0AQAHS2Fib29tIQwA3wDgDADhAOIMAOMARwwA5ADgDADjAOUMAOYARAEAHWphdmEvaW8vRmlsZU5vdEZvdW5kRXhjZXB0aW9uDADnAEQBACJwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uAQAecG9zMV8yYWhpZi90ZXN0Mi9hcGkvRXhlcmNpc2VzAQASamF2YS91dGlsL0l0ZXJhdG9yAQAacG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGgBAAxqYXZhL2lvL0ZpbGUBAAZ2YWx1ZXMBABgoKUxqYXZhL3V0aWwvQ29sbGVjdGlvbjsBABRqYXZhL3V0aWwvQ29sbGVjdGlvbgEACGl0ZXJhdG9yAQAWKClMamF2YS91dGlsL0l0ZXJhdG9yOwEAB2hhc05leHQBAAMoKVoBAARuZXh0AQAUKClMamF2YS9sYW5nL09iamVjdDsBAAhlbnRyeVNldAEAESgpTGphdmEvdXRpbC9TZXQ7AQANamF2YS91dGlsL1NldAEADWphdmEvdXRpbC9NYXABAAhnZXRWYWx1ZQEABmdldEtleQEAA2FkZAEAFShMamF2YS9sYW5nL09iamVjdDspWgEAQyhMcG9zMV8yYWhpZi90ZXN0Mi9SZWZlcmVuY2VTb2x1dGlvbjtMcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGg7KVYBABVqYXZhL3V0aWwvQ29sbGVjdGlvbnMBAARzb3J0AQApKExqYXZhL3V0aWwvTGlzdDtMamF2YS91dGlsL0NvbXBhcmF0b3I7KVYBAAUoSUkpVgEAA2dldAEANShMamF2YS9sYW5nL09iamVjdDspTHBvczFfMmFoaWYvdGVzdDIvTGFieXJpbnRoJFRpbGU7AQAMZ2V0RGlyZWN0aW9uAQAHUGFzc2FnZQEATChMcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGgkRGlyZWN0aW9uOylMcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGgkUGFzc2FnZTsBACJwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aCRQYXNzYWdlAQAGaXNPcGVuAQBLKExwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aCRUaWxlO0xwb3MxXzJhaGlmL3Rlc3QyL0xhYnlyaW50aCREaXJlY3Rpb247WilWAQADcHV0AQA4KExqYXZhL2xhbmcvT2JqZWN0O0xqYXZhL2xhbmcvT2JqZWN0OylMamF2YS9sYW5nL09iamVjdDsBAAJnbwEASyhMcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGgkRGlyZWN0aW9uOylMcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGgkQ29vcmRzOwEAFGdldE9wcG9zaXRlRGlyZWN0aW9uAQAoKClMcG9zMV8yYWhpZi90ZXN0Mi9MYWJ5cmludGgkRGlyZWN0aW9uOwEADWNsZWFyUGFzc2FnZXMBABIoTGphdmEvdXRpbC9NYXA7KVYBAAZhZGRBbGwBABkoTGphdmEvdXRpbC9Db2xsZWN0aW9uOylaAQARKExqYXZhL2lvL0ZpbGU7KVYBABkoTGphdmEvaW8vT3V0cHV0U3RyZWFtOylWAQADKClGAQAPamF2YS9sYW5nL0Zsb2F0AQAHdmFsdWVPZgEAFChGKUxqYXZhL2xhbmcvRmxvYXQ7AQAGcHJpbnRmAQA8KExqYXZhL2xhbmcvU3RyaW5nO1tMamF2YS9sYW5nL09iamVjdDspTGphdmEvaW8vUHJpbnRXcml0ZXI7AQAIaXNPcGVuZWQBAAVwcmludAEAFShMamF2YS9sYW5nL1N0cmluZzspVgEACXNldE9wZW5lZAEABChaKVYBAAh0b1N0cmluZwEAB3ByaW50bG4BACQoTGphdmEvdXRpbC9MaXN0OylMamF2YS9sYW5nL1N0cmluZzsBAAVmbHVzaAEAD3ByaW50U3RhY2tUcmFjZQAhAD4ALgABAD8AAAAKAAEAQwBEAAEARQAAABEAAQABAAAABSq3AAGxAAAAAAABAEYARwABAEUAAAAPAAEAAQAAAAMSArAAAAAAAAEASABHAAEARQAAAA8AAQABAAAAAxICsAAAAAAAAQBJAEoAAQBFAAAASQABAAQAAAArK7YAA7kABAEATSy5AAUBAJkAGSy5AAYBAMAAB04twQAImQAFBKyn/+QDrAAAAAEASwAAAAwAA/wACgcATBv6AAIAAgBNAE4AAgBFAAAAZwACAAUAAABGuwAJWbcACk0rtgALuQAMAQBOLbkABQEAmQAsLbkABgEAwAANOgQZBLkADgEAwQAImQARLBkEuQAPAQC5ABACAFen/9EssAAAAAEASwAAAA8AA/0AEgcATwcATC76AAIAUAAAAAIAUgABAFMATgACAEUAAAAhAAUAAwAAABUqK7cAEU0suwASWSortwATuAAULLAAAAAAAFAAAAACAFIAAQBUAE4AAgBFAAAAIQAFAAMAAAAVKiu3ABFNLLsAFVkqK7cAFrgAFCywAAAAAABQAAAAAgBSAAEAVQBWAAIARQAAALMABwAHAAAAjbsAF1kDA7cAGE4suQAZAQA6BBkEuQAFAQCZAHMZBLkABgEAwAAaOgUrLbYAGxkFtgAcuQAdAQCaAEu7AB5ZtwAfOgYZBi27ACBZKy22ABsZBQO3ACG2ACJXGQYtGQW2ACO7ACBZKy0ZBbYAI7YAGxkFtgAkBLcAIbYAIlcrGQa2ACUtGQW2ACNOp/+JsQAAAAEASwAAABQAA/0AEgcAVwcATPwAbwcAWPkACQBQAAAAAgBaAAEAWwBcAAIARQAAAFEAAgAFAAAAMbsACVm3AApNK7kAGQEATi25AAUBAJkAGi25AAYBAMAAJjoELBkEuQAnAgBXp//jLLAAAAABAEsAAAAOAAL9AA8HAE8HAEz6AB8AUAAAAAIAXQABAF4AXwACAEUAAAEmAAcACgAAANu7AChZuwApWS23ACq3ACs6BLsAF1kDA7cAGDoFLLkAGQEAOgYZBrkABQEAmQCWGQa5AAYBAMAAGjoHKxkFtgAbwQAsmQAjGQQSLQS9AC5ZAysZBbYAG8AACLkALwEAuAAwU7YAMVcrGQW2ABvBACCZADwrGQW2ABvAACA6CBkIGQe2ADLBADOZACQZCBkHtgAywAAzOgkZCbYANJoAEBkEEjW2ADYZCQS2ADcZBBkHtgA4tgA5GQUZB7YAIzoFp/9mGQQrLLYAOrYAORkEtgA7pwAKOgQZBLYAPbEAAQAAANAA0wA8AAEASwAAADEABv4AJAcAYAcAVwcATPwAQQcAWPsARPkAFf8AEQAEBwBhBwBiBwBPBwBjAAEHAGQGAFAAAAACAGUAAQBBAAAAWgALACAAPgBAAAoAMwA+AEIACgAVAAAAAAAAABIAAAAAAAAAFwBoAFEAGQAaAGgAWQQJAAcAaABwBAkACABoAHIGCQANAHYAeAYJACwAaACXBgkAhwBoAMcGCQ=="), 0, 4720, (CodeSource) null);
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
        public Passage getDirection(Labyrinth.Direction direction) {
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
