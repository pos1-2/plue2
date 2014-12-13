package pos1_2ahif.test2.impl;

import pos1_2ahif.test2.impl.BFSLabyrinth;
import pos1_2ahif.test2.impl.BFSLabyrinth.Passage;
import pos1_2ahif.test2.api.*;

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

            this.defineClass("pos1_2ahif.test2.ReferenceSolution$1", DatatypeConverter.parseBase64Binary("yv66vgAAADIAOwkACwAdCQALAB4KAAwAHwsAIAAhBwAiCwAFACMKACQAJQoAJAAmBwAnCgALACgHACkHACsHACwBAA12YWwkbGFieXJpbnRoAQAgTHBvczFfMmFoaWYvdGVzdDIvYXBpL0xhYnlyaW50aDsBAAZ0aGlzJDABACRMcG9zMV8yYWhpZi90ZXN0Mi9SZWZlcmVuY2VTb2x1dGlvbjsBAAY8aW5pdD4BAEcoTHBvczFfMmFoaWYvdGVzdDIvUmVmZXJlbmNlU29sdXRpb247THBvczFfMmFoaWYvdGVzdDIvYXBpL0xhYnlyaW50aDspVgEABENvZGUBAAdjb21wYXJlAQA9KExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9Db29yZHM7THBvczFfMmFoaWYvdGVzdDIvYXBpL0Nvb3JkczspSQEAJyhMamF2YS9sYW5nL09iamVjdDtMamF2YS9sYW5nL09iamVjdDspSQEACVNpZ25hdHVyZQEAR0xqYXZhL2xhbmcvT2JqZWN0O0xqYXZhL3V0aWwvQ29tcGFyYXRvcjxMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvQ29vcmRzOz47AQAPRW5jbG9zaW5nTWV0aG9kBwAtDAAuAC8MABAAEQwADgAPDAASADAHADEMADIAMwEAHXBvczFfMmFoaWYvdGVzdDIvYXBpL1RyZWFzdXJlDAA0ADUHADYMADcAOAwAOQA6AQAbcG9zMV8yYWhpZi90ZXN0Mi9hcGkvQ29vcmRzDAAVABYBACRwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uJDEBAAxJbm5lckNsYXNzZXMBABBqYXZhL2xhbmcvT2JqZWN0AQAUamF2YS91dGlsL0NvbXBhcmF0b3IBACJwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uAQAaZ2V0VHJlYXN1cmVzT3JkZXJlZEJ5VmFsdWUBADIoTHBvczFfMmFoaWYvdGVzdDIvYXBpL0xhYnlyaW50aDspTGphdmEvdXRpbC9MaXN0OwEAAygpVgEAHnBvczFfMmFoaWYvdGVzdDIvYXBpL0xhYnlyaW50aAEAA2dldAEAJihMamF2YS9sYW5nL09iamVjdDspTGphdmEvbGFuZy9PYmplY3Q7AQAIZ2V0VmFsdWUBAAMoKUYBAA9qYXZhL2xhbmcvRmxvYXQBAAd2YWx1ZU9mAQAUKEYpTGphdmEvbGFuZy9GbG9hdDsBAAljb21wYXJlVG8BABQoTGphdmEvbGFuZy9GbG9hdDspSQAgAAsADAABAA0AAhAQAA4ADwAAEBAAEAARAAAAAwAAABIAEwABABQAAAAbAAIAAwAAAA8qK7UAASostQACKrcAA7EAAAAAAAEAFQAWAAEAFAAAAEEAAgAFAAAANSq0AAIruQAEAgDAAAVOKrQAAiy5AAQCAMAABToELbkABgEAuAAHGQS5AAYBALgAB7YACHSsAAAAABBBABUAFwABABQAAAAZAAMAAwAAAA0qK8AACSzAAAm2AAqsAAAAAAADABgAAAACABkAGgAAAAQAGwAcACoAAAAKAAEACwAAAAAAAA=="), 0, 1219, (CodeSource) null);
            this.defineClass("pos1_2ahif.test2.ReferenceSolution$2", DatatypeConverter.parseBase64Binary("yv66vgAAADIAPgkADAAeCQAMAB8KAA0AIAsAIQAiBwAjCwAFACQLAAUAJQoAJgAnCgAmACgHACkKAAwAKgcAKwcALQcALgEADXZhbCRsYWJ5cmludGgBACBMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvTGFieXJpbnRoOwEABnRoaXMkMAEAJExwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uOwEABjxpbml0PgEARyhMcG9zMV8yYWhpZi90ZXN0Mi9SZWZlcmVuY2VTb2x1dGlvbjtMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvTGFieXJpbnRoOylWAQAEQ29kZQEAB2NvbXBhcmUBAD0oTHBvczFfMmFoaWYvdGVzdDIvYXBpL0Nvb3JkcztMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvQ29vcmRzOylJAQAnKExqYXZhL2xhbmcvT2JqZWN0O0xqYXZhL2xhbmcvT2JqZWN0OylJAQAJU2lnbmF0dXJlAQBHTGphdmEvbGFuZy9PYmplY3Q7TGphdmEvdXRpbC9Db21wYXJhdG9yPExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9Db29yZHM7PjsBAA9FbmNsb3NpbmdNZXRob2QHAC8MADAAMQwAEQASDAAPABAMABMAMgcAMwwANAA1AQAdcG9zMV8yYWhpZi90ZXN0Mi9hcGkvVHJlYXN1cmUMADYANwwAOAA3BwA5DAA6ADsMADwAPQEAG3BvczFfMmFoaWYvdGVzdDIvYXBpL0Nvb3JkcwwAFgAXAQAkcG9zMV8yYWhpZi90ZXN0Mi9SZWZlcmVuY2VTb2x1dGlvbiQyAQAMSW5uZXJDbGFzc2VzAQAQamF2YS9sYW5nL09iamVjdAEAFGphdmEvdXRpbC9Db21wYXJhdG9yAQAicG9zMV8yYWhpZi90ZXN0Mi9SZWZlcmVuY2VTb2x1dGlvbgEAI2dldFRyZWFzdXJlc09yZGVyZWRCeVZhbHVlUGVyV2VpZ2h0AQAyKExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9MYWJ5cmludGg7KUxqYXZhL3V0aWwvTGlzdDsBAAMoKVYBAB5wb3MxXzJhaGlmL3Rlc3QyL2FwaS9MYWJ5cmludGgBAANnZXQBACYoTGphdmEvbGFuZy9PYmplY3Q7KUxqYXZhL2xhbmcvT2JqZWN0OwEACGdldFZhbHVlAQADKClGAQAJZ2V0V2VpZ2h0AQAPamF2YS9sYW5nL0Zsb2F0AQAHdmFsdWVPZgEAFChGKUxqYXZhL2xhbmcvRmxvYXQ7AQAJY29tcGFyZVRvAQAUKExqYXZhL2xhbmcvRmxvYXQ7KUkAIAAMAA0AAQAOAAIQEAAPABAAABAQABEAEgAAAAMAAAATABQAAQAVAAAAGwACAAMAAAAPKiu1AAEqLLUAAiq3AAOxAAAAAAABABYAFwABABUAAABQAAMABQAAAEQqtAACK7kABAIAwAAFTiq0AAIsuQAEAgDAAAU6BC25AAYBAC25AAcBAG64AAgZBLkABgEAGQS5AAcBAG64AAi2AAl0rAAAAAAQQQAWABgAAQAVAAAAGQADAAMAAAANKivAAAoswAAKtgALrAAAAAAAAwAZAAAAAgAaABsAAAAEABwAHQAsAAAACgABAAwAAAAAAAA="), 0, 1265, (CodeSource) null);
            this.defineClass("pos1_2ahif.test2.ReferenceSolution$MyPassage", DatatypeConverter.parseBase64Binary("yv66vgAAADIAHAoABAAPCQADABAHABIHABUHABcBAAZvcGVuZWQBAAFaAQAGPGluaXQ+AQAEKFopVgEABENvZGUBAAZpc09wZW4BAAMoKVoBAAhpc09wZW5lZAEACXNldE9wZW5lZAwACAAZDAAGAAcHABoBACxwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uJE15UGFzc2FnZQEACU15UGFzc2FnZQEADElubmVyQ2xhc3NlcwEAEGphdmEvbGFuZy9PYmplY3QHABsBACpwb3MxXzJhaGlmL3Rlc3QyL2ltcGwvQkZTTGFieXJpbnRoJFBhc3NhZ2UBAAdQYXNzYWdlAQADKClWAQAicG9zMV8yYWhpZi90ZXN0Mi9SZWZlcmVuY2VTb2x1dGlvbgEAInBvczFfMmFoaWYvdGVzdDIvaW1wbC9CRlNMYWJ5cmludGgAIAADAAQAAQAFAAEAAQAGAAcAAAAEAAEACAAJAAEACgAAABYAAgACAAAACiq3AAEqG7UAArEAAAAAAAEACwAMAAEACgAAAA4AAQABAAAAAgSsAAAAAAABAA0ADAABAAoAAAARAAEAAQAAAAUqtAACrAAAAAAAAQAOAAkAAQAKAAAAEgACAAIAAAAGKhu1AAKxAAAAAAABABQAAAASAAIAAwARABMACgAFABYAGAYJ"), 0, 522, (CodeSource) null);
            this.defineClass("pos1_2ahif.test2.ReferenceSolution$MyTile", DatatypeConverter.parseBase64Binary("yv66vgAAADIAMgoACgAbCQAJABwJAAkAHQkACQAeCgAfACAHACIKAAYAJAoACgAlBwAmBwAoAQAIb3JpZ2luYWwBABtMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvVGlsZTsBAARvcGVuAQAgTHBvczFfMmFoaWYvdGVzdDIvYXBpL0RpcmVjdGlvbjsBAAhpbml0T3BlbgEAAVoBAAY8aW5pdD4BAD8oTHBvczFfMmFoaWYvdGVzdDIvYXBpL1RpbGU7THBvczFfMmFoaWYvdGVzdDIvYXBpL0RpcmVjdGlvbjtaKVYBAARDb2RlAQAMZ2V0RGlyZWN0aW9uBwAqAQAHUGFzc2FnZQEADElubmVyQ2xhc3NlcwEATihMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvRGlyZWN0aW9uOylMcG9zMV8yYWhpZi90ZXN0Mi9pbXBsL0JGU0xhYnlyaW50aCRQYXNzYWdlOwEADVN0YWNrTWFwVGFibGUHACoMABEAKwwACwAMDAANAA4MAA8AEAcALAwALQAuBwAvAQAscG9zMV8yYWhpZi90ZXN0Mi9SZWZlcmVuY2VTb2x1dGlvbiRNeVBhc3NhZ2UBAAlNeVBhc3NhZ2UMABEAMAwAFAAYAQApcG9zMV8yYWhpZi90ZXN0Mi9SZWZlcmVuY2VTb2x1dGlvbiRNeVRpbGUBAAZNeVRpbGUBABlwb3MxXzJhaGlmL3Rlc3QyL2FwaS9UaWxlBwAxAQAqcG9zMV8yYWhpZi90ZXN0Mi9pbXBsL0JGU0xhYnlyaW50aCRQYXNzYWdlAQADKClWAQAecG9zMV8yYWhpZi90ZXN0Mi9hcGkvRGlyZWN0aW9uAQAGZXF1YWxzAQAVKExqYXZhL2xhbmcvT2JqZWN0OylaAQAicG9zMV8yYWhpZi90ZXN0Mi9SZWZlcmVuY2VTb2x1dGlvbgEABChaKVYBACJwb3MxXzJhaGlmL3Rlc3QyL2ltcGwvQkZTTGFieXJpbnRoACAACQAKAAAAAwASAAsADAAAABIADQAOAAAAEgAPABAAAAACAAEAEQASAAEAEwAAACAAAgAEAAAAFCq3AAEqK7UAAiostQADKh21AASxAAAAAAABABQAGAABABMAAAA7AAMAAgAAACIrKrQAA7YABZkAEbsABlkqtAAEtwAHpwALKrQAAiu2AAiwAAAAAQAZAAAABwACGUcHABoAAQAXAAAAGgADABUAKQAWBgkABgAhACMACgAJACEAJwAK"), 0, 948, (CodeSource) null);
            this.defineClass("pos1_2ahif.test2.ReferenceSolution", DatatypeConverter.parseBase64Binary("yv66vgAAADIA5QoALgBkCABlCwBmAGcLAGgAaQsAagBrCwBqAGwHAG0HAG4HAG8KAAkAZAsAZgBwCwBxAGkHAHMLAA0AdQsADQB2CwAmAHcKAD4AeAcAeQoAEgB6CgB7AHwHAH0KABUAegcAfgoAFwB/CwAmAGkHAIALAGYAgQoABwCCCwCDAIQHAIUKAB4AZAcAhgoAIACHCgAeAIgKABcAiQoAGgCKCwBmAIsHAIwLACYAjQcAjgcAjwoAKQCQCgAoAJEHAJIIAJMHAJQLAAgAlQoAlgCXCgAoAJgKACAAggcAmQoAMwCaCACbCgAoAJwKADMAnQoAGgCeCgAoAJ8LAGYAoAoAKAChBwCiCgA8AKMHAKQHAKUBAAZNeVRpbGUBAAxJbm5lckNsYXNzZXMBAAlNeVBhc3NhZ2UBAAY8aW5pdD4BAAMoKVYBAARDb2RlAQAJZ2V0TXlOYW1lAQAUKClMamF2YS9sYW5nL1N0cmluZzsBABRnZXRNeUV4YW1BY2NvdW50TmFtZQEADmhhc0FueVRyZWFzdXJlAQAjKExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9MYWJ5cmludGg7KVoBAA1TdGFja01hcFRhYmxlBwCmAQAUZ2V0QWxsVHJlYXN1cmVDb29yZHMBADIoTHBvczFfMmFoaWYvdGVzdDIvYXBpL0xhYnlyaW50aDspTGphdmEvdXRpbC9MaXN0OwcAjAEACVNpZ25hdHVyZQEAUShMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvTGFieXJpbnRoOylMamF2YS91dGlsL0xpc3Q8THBvczFfMmFoaWYvdGVzdDIvYXBpL0Nvb3Jkczs+OwEAGmdldFRyZWFzdXJlc09yZGVyZWRCeVZhbHVlAQAjZ2V0VHJlYXN1cmVzT3JkZXJlZEJ5VmFsdWVQZXJXZWlnaHQBABZjbGVhclBhc3NhZ2VzQWxvbmdQYXRoAQAzKExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9MYWJ5cmludGg7TGphdmEvdXRpbC9MaXN0OylWBwB+BwCAAQBVKExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9MYWJ5cmludGg7TGphdmEvdXRpbC9MaXN0PExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9EaXJlY3Rpb247PjspVgEACWpvaW5QYXRocwEAIihMamF2YS91dGlsL0xpc3Q7KUxqYXZhL3V0aWwvTGlzdDsBAHgoTGphdmEvdXRpbC9MaXN0PExqYXZhL3V0aWwvTGlzdDxMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvRGlyZWN0aW9uOz47PjspTGphdmEvdXRpbC9MaXN0PExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9EaXJlY3Rpb247PjsBABhwcmludFBsYW5Gb3JUcmVhc3VyZUh1bnQBAEEoTHBvczFfMmFoaWYvdGVzdDIvYXBpL0xhYnlyaW50aDtMamF2YS91dGlsL0xpc3Q7TGphdmEvaW8vRmlsZTspVgcAjgcApAcApwcAqAcAogEAYyhMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvTGFieXJpbnRoO0xqYXZhL3V0aWwvTGlzdDxMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvRGlyZWN0aW9uOz47TGphdmEvaW8vRmlsZTspVgwAQwBEAQASUmVmZXJlbmNlIFNvbHV0aW9uBwCnDACpAKoHAKsMAKwArQcApgwArgCvDACwALEBABlwb3MxXzJhaGlmL3Rlc3QyL2FwaS9UaWxlAQAdcG9zMV8yYWhpZi90ZXN0Mi9hcGkvVHJlYXN1cmUBABNqYXZhL3V0aWwvQXJyYXlMaXN0DACyALMHALQHALUBABNqYXZhL3V0aWwvTWFwJEVudHJ5AQAFRW50cnkMALYAsQwAtwCxDAC4ALkMAE0ATgEAJHBvczFfMmFoaWYvdGVzdDIvUmVmZXJlbmNlU29sdXRpb24kMQwAQwC6BwC7DAC8AL0BACRwb3MxXzJhaGlmL3Rlc3QyL1JlZmVyZW5jZVNvbHV0aW9uJDIBABtwb3MxXzJhaGlmL3Rlc3QyL2FwaS9Db29yZHMMAEMAvgEAHnBvczFfMmFoaWYvdGVzdDIvYXBpL0RpcmVjdGlvbgwAvwDADADBAMMHAMUMAMYArwEAEWphdmEvdXRpbC9IYXNoTWFwAQApcG9zMV8yYWhpZi90ZXN0Mi9SZWZlcmVuY2VTb2x1dGlvbiRNeVRpbGUMAEMAxwwAyADJDADKAMsMAMwAzQwAzgDPAQAOamF2YS91dGlsL0xpc3QMANAA0QEAE2phdmEvaW8vUHJpbnRXcml0ZXIBABhqYXZhL2lvL0ZpbGVPdXRwdXRTdHJlYW0MAEMA0gwAQwDTAQAmcG9zMV8yYWhpZi90ZXN0Mi9hcGkvQ29sbGVjdGVkVHJlYXN1cmUBABBGZXR0ZSBCZXV0ZTogJWYKAQAQamF2YS9sYW5nL09iamVjdAwAtgDUBwDVDADWANcMANgA2QEALHBvczFfMmFoaWYvdGVzdDIvUmVmZXJlbmNlU29sdXRpb24kTXlQYXNzYWdlDADaAK8BAAdLYWJvb20hDADbANwMAN0A3gwA3wBHDADgANwMAN8A4QwA4gBEAQAdamF2YS9pby9GaWxlTm90Rm91bmRFeGNlcHRpb24MAOMARAEAInBvczFfMmFoaWYvdGVzdDIvUmVmZXJlbmNlU29sdXRpb24BAB5wb3MxXzJhaGlmL3Rlc3QyL2FwaS9FeGVyY2lzZXMBABJqYXZhL3V0aWwvSXRlcmF0b3IBAB5wb3MxXzJhaGlmL3Rlc3QyL2FwaS9MYWJ5cmludGgBAAxqYXZhL2lvL0ZpbGUBAAZ2YWx1ZXMBABgoKUxqYXZhL3V0aWwvQ29sbGVjdGlvbjsBABRqYXZhL3V0aWwvQ29sbGVjdGlvbgEACGl0ZXJhdG9yAQAWKClMamF2YS91dGlsL0l0ZXJhdG9yOwEAB2hhc05leHQBAAMoKVoBAARuZXh0AQAUKClMamF2YS9sYW5nL09iamVjdDsBAAhlbnRyeVNldAEAESgpTGphdmEvdXRpbC9TZXQ7AQANamF2YS91dGlsL1NldAEADWphdmEvdXRpbC9NYXABAAhnZXRWYWx1ZQEABmdldEtleQEAA2FkZAEAFShMamF2YS9sYW5nL09iamVjdDspWgEARyhMcG9zMV8yYWhpZi90ZXN0Mi9SZWZlcmVuY2VTb2x1dGlvbjtMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvTGFieXJpbnRoOylWAQAVamF2YS91dGlsL0NvbGxlY3Rpb25zAQAEc29ydAEAKShMamF2YS91dGlsL0xpc3Q7TGphdmEvdXRpbC9Db21wYXJhdG9yOylWAQAFKElJKVYBAANnZXQBACYoTGphdmEvbGFuZy9PYmplY3Q7KUxqYXZhL2xhbmcvT2JqZWN0OwEADGdldERpcmVjdGlvbgEAB1Bhc3NhZ2UBAE4oTHBvczFfMmFoaWYvdGVzdDIvYXBpL0RpcmVjdGlvbjspTHBvczFfMmFoaWYvdGVzdDIvaW1wbC9CRlNMYWJ5cmludGgkUGFzc2FnZTsHAOQBACpwb3MxXzJhaGlmL3Rlc3QyL2ltcGwvQkZTTGFieXJpbnRoJFBhc3NhZ2UBAAZpc09wZW4BAD8oTHBvczFfMmFoaWYvdGVzdDIvYXBpL1RpbGU7THBvczFfMmFoaWYvdGVzdDIvYXBpL0RpcmVjdGlvbjtaKVYBAANwdXQBADgoTGphdmEvbGFuZy9PYmplY3Q7TGphdmEvbGFuZy9PYmplY3Q7KUxqYXZhL2xhbmcvT2JqZWN0OwEAAmdvAQA/KExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9EaXJlY3Rpb247KUxwb3MxXzJhaGlmL3Rlc3QyL2FwaS9Db29yZHM7AQAUZ2V0T3Bwb3NpdGVEaXJlY3Rpb24BACIoKUxwb3MxXzJhaGlmL3Rlc3QyL2FwaS9EaXJlY3Rpb247AQANY2xlYXJQYXNzYWdlcwEAEihMamF2YS91dGlsL01hcDspVgEABmFkZEFsbAEAGShMamF2YS91dGlsL0NvbGxlY3Rpb247KVoBABEoTGphdmEvaW8vRmlsZTspVgEAGShMamF2YS9pby9PdXRwdXRTdHJlYW07KVYBAAMoKUYBAA9qYXZhL2xhbmcvRmxvYXQBAAd2YWx1ZU9mAQAUKEYpTGphdmEvbGFuZy9GbG9hdDsBAAZwcmludGYBADwoTGphdmEvbGFuZy9TdHJpbmc7W0xqYXZhL2xhbmcvT2JqZWN0OylMamF2YS9pby9QcmludFdyaXRlcjsBAAhpc09wZW5lZAEABXByaW50AQAVKExqYXZhL2xhbmcvU3RyaW5nOylWAQAJc2V0T3BlbmVkAQAEKFopVgEACHRvU3RyaW5nAQAHcHJpbnRsbgEAJChMamF2YS91dGlsL0xpc3Q7KUxqYXZhL2xhbmcvU3RyaW5nOwEABWZsdXNoAQAPcHJpbnRTdGFja1RyYWNlAQAicG9zMV8yYWhpZi90ZXN0Mi9pbXBsL0JGU0xhYnlyaW50aAAhAD4ALgABAD8AAAAKAAEAQwBEAAEARQAAABEAAQABAAAABSq3AAGxAAAAAAABAEYARwABAEUAAAAPAAEAAQAAAAMSArAAAAAAAAEASABHAAEARQAAAA8AAQABAAAAAxICsAAAAAAAAQBJAEoAAQBFAAAASwABAAQAAAAtK7kAAwEAuQAEAQBNLLkABQEAmQAZLLkABgEAwAAHTi3BAAiZAAUErKf/5AOsAAAAAQBLAAAADAAD/AAMBwBMG/oAAgACAE0ATgACAEUAAABpAAIABQAAAEi7AAlZtwAKTSu5AAsBALkADAEATi25AAUBAJkALC25AAYBAMAADToEGQS5AA4BAMEACJkAESwZBLkADwEAuQAQAgBXp//RLLAAAAABAEsAAAAPAAP9ABQHAE8HAEwu+gACAFAAAAACAFEAAQBSAE4AAgBFAAAAIQAFAAMAAAAVKiu3ABFNLLsAElkqK7cAE7gAFCywAAAAAABQAAAAAgBRAAEAUwBOAAIARQAAACEABQADAAAAFSortwARTSy7ABVZKiu3ABa4ABQssAAAAAAAUAAAAAIAUQABAFQAVQACAEUAAADEAAcABwAAAJ67ABdZAwO3ABhOLLkAGQEAOgQZBLkABQEAmQCEGQS5AAYBAMAAGjoFKy25ABsCAMAABxkFtgAcuQAdAQCaAFe7AB5ZtwAfOgYZBi27ACBZKy25ABsCAMAABxkFA7cAIbYAIlcZBi0ZBbYAI7sAIFkrLRkFtgAjuQAbAgDAAAcZBbYAJAS3ACG2ACJXKxkGuQAlAgAtGQW2ACNOp/94sQAAAAEASwAAABQAA/0AEgcAVgcATPwAgAcAV/kACQBQAAAAAgBYAAEAWQBaAAIARQAAAFEAAgAFAAAAMbsACVm3AApNK7kAGQEATi25AAUBAJkAGi25AAYBAMAAJjoELBkEuQAnAgBXp//jLLAAAAABAEsAAAAOAAL9AA8HAE8HAEz6AB8AUAAAAAIAWwABAFwAXQACAEUAAAEwAAcACgAAAOW7AChZuwApWS23ACq3ACs6BLsAF1kDA7cAGDoFLLkAGQEAOgYZBrkABQEAmQCeGQa5AAYBAMAAGjoHKxkFuQAbAgDBACyZACUZBBItBL0ALlkDKxkFuQAbAgDAAAi5AC8BALgAMFO2ADFXKxkFuQAbAgDBACCZAD4rGQW5ABsCAMAAIDoIGQgZB7YAMsEAM5kAJBkIGQe2ADLAADM6CRkJtgA0mgAQGQQSNbYANhkJBLYANxkEGQe2ADi2ADkZBRkHtgAjOgWn/14ZBCssuQA6AgC2ADkZBLYAO6cACjoEGQS2AD2xAAEAAADaAN0APAABAEsAAAAxAAb+ACQHAF4HAFYHAEz8AEUHAFf7AEj5ABX/ABMABAcAXwcAYAcATwcAYQABBwBiBgBQAAAAAgBjAAEAQQAAADIABgAgAD4AQAAKADMAPgBCAAoAFQAAAAAAAAASAAAAAAAAAA0AcgB0BgkAgwDEAMIGCQ=="), 0, 4633, (CodeSource) null);
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
            public BFSLabyrinth.Passage getLeft() {
                return l;
            }

            @Override
            public BFSLabyrinth.Passage getRight() {
                return r;
            }

            @Override
            public BFSLabyrinth.Passage getUp() {
                return u;
            }

            @Override
            public BFSLabyrinth.Passage getDown() {
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

        labs.put("l35x15-treasure-4-8--3-1--13-1--2-1--1-1-and-1-7", new BFSLabyrinth(new HashMap<Coords, Tile>() {{
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
