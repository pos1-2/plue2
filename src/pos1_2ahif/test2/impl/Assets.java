package pos1_2ahif.test2.impl;

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

            this.defineClass("pos1_2ahif.test2.internal.ReferenceSolution$1", DatatypeConverter.parseBase64Binary("yv66vgAAADIAOwkACwAdCQALAB4KAAwAHwsAIAAhBwAiCwAFACMKACQAJQoAJAAmBwAnCgALACgHACkHACsHACwBAA12YWwkbGFieXJpbnRoAQAgTHBvczFfMmFoaWYvdGVzdDIvYXBpL0xhYnlyaW50aDsBAAZ0aGlzJDABAC1McG9zMV8yYWhpZi90ZXN0Mi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbjsBAAY8aW5pdD4BAFAoTHBvczFfMmFoaWYvdGVzdDIvaW50ZXJuYWwvUmVmZXJlbmNlU29sdXRpb247THBvczFfMmFoaWYvdGVzdDIvYXBpL0xhYnlyaW50aDspVgEABENvZGUBAAdjb21wYXJlAQA9KExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9Db29yZHM7THBvczFfMmFoaWYvdGVzdDIvYXBpL0Nvb3JkczspSQEAJyhMamF2YS9sYW5nL09iamVjdDtMamF2YS9sYW5nL09iamVjdDspSQEACVNpZ25hdHVyZQEAR0xqYXZhL2xhbmcvT2JqZWN0O0xqYXZhL3V0aWwvQ29tcGFyYXRvcjxMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvQ29vcmRzOz47AQAPRW5jbG9zaW5nTWV0aG9kBwAtDAAuAC8MABAAEQwADgAPDAASADAHADEMADIAMwEAHXBvczFfMmFoaWYvdGVzdDIvYXBpL1RyZWFzdXJlDAA0ADUHADYMADcAOAwAOQA6AQAbcG9zMV8yYWhpZi90ZXN0Mi9hcGkvQ29vcmRzDAAVABYBAC1wb3MxXzJhaGlmL3Rlc3QyL2ludGVybmFsL1JlZmVyZW5jZVNvbHV0aW9uJDEBAAxJbm5lckNsYXNzZXMBABBqYXZhL2xhbmcvT2JqZWN0AQAUamF2YS91dGlsL0NvbXBhcmF0b3IBACtwb3MxXzJhaGlmL3Rlc3QyL2ludGVybmFsL1JlZmVyZW5jZVNvbHV0aW9uAQAaZ2V0VHJlYXN1cmVzT3JkZXJlZEJ5VmFsdWUBADIoTHBvczFfMmFoaWYvdGVzdDIvYXBpL0xhYnlyaW50aDspTGphdmEvdXRpbC9MaXN0OwEAAygpVgEAHnBvczFfMmFoaWYvdGVzdDIvYXBpL0xhYnlyaW50aAEAA2dldAEAJihMamF2YS9sYW5nL09iamVjdDspTGphdmEvbGFuZy9PYmplY3Q7AQAIZ2V0VmFsdWUBAAMoKUYBAA9qYXZhL2xhbmcvRmxvYXQBAAd2YWx1ZU9mAQAUKEYpTGphdmEvbGFuZy9GbG9hdDsBAAljb21wYXJlVG8BABQoTGphdmEvbGFuZy9GbG9hdDspSQAgAAsADAABAA0AAhAQAA4ADwAAEBAAEAARAAAAAwAAABIAEwABABQAAAAbAAIAAwAAAA8qK7UAASostQACKrcAA7EAAAAAAAEAFQAWAAEAFAAAAEEAAgAFAAAANSq0AAIruQAEAgDAAAVOKrQAAiy5AAQCAMAABToELbkABgEAuAAHGQS5AAYBALgAB7YACHSsAAAAABBBABUAFwABABQAAAAZAAMAAwAAAA0qK8AACSzAAAm2AAqsAAAAAAADABgAAAACABkAGgAAAAQAGwAcACoAAAAKAAEACwAAAAAAAA=="), 0, 1255, (CodeSource) null);
            this.defineClass("pos1_2ahif.test2.internal.ReferenceSolution$2", DatatypeConverter.parseBase64Binary("yv66vgAAADIAPgkADAAeCQAMAB8KAA0AIAsAIQAiBwAjCwAFACQLAAUAJQoAJgAnCgAmACgHACkKAAwAKgcAKwcALQcALgEADXZhbCRsYWJ5cmludGgBACBMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvTGFieXJpbnRoOwEABnRoaXMkMAEALUxwb3MxXzJhaGlmL3Rlc3QyL2ludGVybmFsL1JlZmVyZW5jZVNvbHV0aW9uOwEABjxpbml0PgEAUChMcG9zMV8yYWhpZi90ZXN0Mi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbjtMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvTGFieXJpbnRoOylWAQAEQ29kZQEAB2NvbXBhcmUBAD0oTHBvczFfMmFoaWYvdGVzdDIvYXBpL0Nvb3JkcztMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvQ29vcmRzOylJAQAnKExqYXZhL2xhbmcvT2JqZWN0O0xqYXZhL2xhbmcvT2JqZWN0OylJAQAJU2lnbmF0dXJlAQBHTGphdmEvbGFuZy9PYmplY3Q7TGphdmEvdXRpbC9Db21wYXJhdG9yPExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9Db29yZHM7PjsBAA9FbmNsb3NpbmdNZXRob2QHAC8MADAAMQwAEQASDAAPABAMABMAMgcAMwwANAA1AQAdcG9zMV8yYWhpZi90ZXN0Mi9hcGkvVHJlYXN1cmUMADYANwwAOAA3BwA5DAA6ADsMADwAPQEAG3BvczFfMmFoaWYvdGVzdDIvYXBpL0Nvb3JkcwwAFgAXAQAtcG9zMV8yYWhpZi90ZXN0Mi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbiQyAQAMSW5uZXJDbGFzc2VzAQAQamF2YS9sYW5nL09iamVjdAEAFGphdmEvdXRpbC9Db21wYXJhdG9yAQArcG9zMV8yYWhpZi90ZXN0Mi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbgEAI2dldFRyZWFzdXJlc09yZGVyZWRCeVZhbHVlUGVyV2VpZ2h0AQAyKExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9MYWJ5cmludGg7KUxqYXZhL3V0aWwvTGlzdDsBAAMoKVYBAB5wb3MxXzJhaGlmL3Rlc3QyL2FwaS9MYWJ5cmludGgBAANnZXQBACYoTGphdmEvbGFuZy9PYmplY3Q7KUxqYXZhL2xhbmcvT2JqZWN0OwEACGdldFZhbHVlAQADKClGAQAJZ2V0V2VpZ2h0AQAPamF2YS9sYW5nL0Zsb2F0AQAHdmFsdWVPZgEAFChGKUxqYXZhL2xhbmcvRmxvYXQ7AQAJY29tcGFyZVRvAQAUKExqYXZhL2xhbmcvRmxvYXQ7KUkAIAAMAA0AAQAOAAIQEAAPABAAABAQABEAEgAAAAMAAAATABQAAQAVAAAAGwACAAMAAAAPKiu1AAEqLLUAAiq3AAOxAAAAAAABABYAFwABABUAAABQAAMABQAAAEQqtAACK7kABAIAwAAFTiq0AAIsuQAEAgDAAAU6BC25AAYBAC25AAcBAG64AAgZBLkABgEAGQS5AAcBAG64AAi2AAl0rAAAAAAQQQAWABgAAQAVAAAAGQADAAMAAAANKivAAAoswAAKtgALrAAAAAAAAwAZAAAAAgAaABsAAAAEABwAHQAsAAAACgABAAwAAAAAAAA="), 0, 1301, (CodeSource) null);
            this.defineClass("pos1_2ahif.test2.internal.ReferenceSolution$MyTile", DatatypeConverter.parseBase64Binary("yv66vgAAADIAKQoACAAYCQAHABkJAAcAGgkABwAbCgAcAB0KAAgAHgcAIAcAIwEACG9yaWdpbmFsAQAbTHBvczFfMmFoaWYvdGVzdDIvYXBpL1RpbGU7AQAPZGlyZWN0aW9uT3BlbmVkAQAgTHBvczFfMmFoaWYvdGVzdDIvYXBpL0RpcmVjdGlvbjsBAAtwcmludEthYm9vbQEAAVoBAAY8aW5pdD4BAD8oTHBvczFfMmFoaWYvdGVzdDIvYXBpL1RpbGU7THBvczFfMmFoaWYvdGVzdDIvYXBpL0RpcmVjdGlvbjtaKVYBAARDb2RlAQAPaXNEaXJlY3Rpb25PcGVuAQAjKExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9EaXJlY3Rpb247KVoBAA1TdGFja01hcFRhYmxlAQALZ2V0T3JpZ2luYWwBAB0oKUxwb3MxXzJhaGlmL3Rlc3QyL2FwaS9UaWxlOwEAEXNob3VsZFByaW50S2Fib29tDAAPACQMAAkACgwACwAMDAANAA4HACUMACYAJwwAEgATBwAoAQAycG9zMV8yYWhpZi90ZXN0Mi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbiRNeVRpbGUBAAZNeVRpbGUBAAxJbm5lckNsYXNzZXMBABlwb3MxXzJhaGlmL3Rlc3QyL2FwaS9UaWxlAQADKClWAQAecG9zMV8yYWhpZi90ZXN0Mi9hcGkvRGlyZWN0aW9uAQAGZXF1YWxzAQAVKExqYXZhL2xhbmcvT2JqZWN0OylaAQArcG9zMV8yYWhpZi90ZXN0Mi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbgAgAAcACAAAAAMAEgAJAAoAAAASAAsADAAAAAIADQAOAAAABAABAA8AEAABABEAAAAgAAIABAAAABQqtwABKiu1AAIqLLUAAyodtQAEsQAAAAAAAQASABMAAQARAAAALwACAAIAAAAYKyq0AAO2AAWZAAcEpwALKrQAAiu2AAasAAAAAQAUAAAABQACD0cBAAEAFQAWAAEAEQAAABEAAQABAAAABSq0AAKwAAAAAAABABcAEwABABEAAAAuAAIAAwAAABkrKrQAA7YABZoABQOsKrQABD0qA7UABBysAAAAAQAUAAAAAwABDQABACIAAAAKAAEABwAfACEACg=="), 0, 889, (CodeSource) null);
            this.defineClass("pos1_2ahif.test2.internal.ReferenceSolution", DatatypeConverter.parseBase64Binary("yv66vgAAADIA5AoALQBmCABnCwBoAGkLAGoAawsAbABtCwBsAG4HAG8HAHAHAHEKAAkAZgsAaAByCwBzAGsHAHULAA0AdwsADQB4CwAlAHkKAEAAegcAewoAEgB8CgB9AH4HAH8KABUAfAcAgAoAFwCBCwAlAGsHAIILAGgAgwoABwCEBwCFCgAdAGYHAIYKAB8AhwoAHQCICgAXAIkKABoAigsAaACLBwCMCwAlAI0HAI4HAI8KACgAkAoAJwCRBwCSCACTBwCUCwAIAJUKAJYAlwoAJwCYCgAfAJkHAJoKADIAZggAmwoAMgCcCgAyAJ0IAJ4KADIAnwoAJwCgCgAfAKEKABoAnwsAaACiCgAnAKMHAKQKAD4ApQcApgcApwEABk15VGlsZQEADElubmVyQ2xhc3NlcwEABjxpbml0PgEAAygpVgEABENvZGUBAAlnZXRNeU5hbWUBABQoKUxqYXZhL2xhbmcvU3RyaW5nOwEAFGdldE15RXhhbUFjY291bnROYW1lAQAOaGFzQW55VHJlYXN1cmUBACMoTHBvczFfMmFoaWYvdGVzdDIvYXBpL0xhYnlyaW50aDspWgEADVN0YWNrTWFwVGFibGUHAKgBABRnZXRBbGxUcmVhc3VyZUNvb3JkcwEAMihMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvTGFieXJpbnRoOylMamF2YS91dGlsL0xpc3Q7BwCMAQAJU2lnbmF0dXJlAQBRKExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9MYWJ5cmludGg7KUxqYXZhL3V0aWwvTGlzdDxMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvQ29vcmRzOz47AQAaZ2V0VHJlYXN1cmVzT3JkZXJlZEJ5VmFsdWUBACNnZXRUcmVhc3VyZXNPcmRlcmVkQnlWYWx1ZVBlcldlaWdodAEAFmNsZWFyUGFzc2FnZXNBbG9uZ1BhdGgBADMoTHBvczFfMmFoaWYvdGVzdDIvYXBpL0xhYnlyaW50aDtMamF2YS91dGlsL0xpc3Q7KVYHAIAHAIIBAFUoTHBvczFfMmFoaWYvdGVzdDIvYXBpL0xhYnlyaW50aDtMamF2YS91dGlsL0xpc3Q8THBvczFfMmFoaWYvdGVzdDIvYXBpL0RpcmVjdGlvbjs+OylWAQAJam9pblBhdGhzAQAiKExqYXZhL3V0aWwvTGlzdDspTGphdmEvdXRpbC9MaXN0OwEAeChMamF2YS91dGlsL0xpc3Q8TGphdmEvdXRpbC9MaXN0PExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9EaXJlY3Rpb247Pjs+OylMamF2YS91dGlsL0xpc3Q8THBvczFfMmFoaWYvdGVzdDIvYXBpL0RpcmVjdGlvbjs+OwEAGHByaW50UGxhbkZvclRyZWFzdXJlSHVudAEAQShMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvTGFieXJpbnRoO0xqYXZhL3V0aWwvTGlzdDtMamF2YS9pby9GaWxlOylWBwCOBwBvBwCmBwCpBwCqBwCkAQBjKExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9MYWJ5cmludGg7TGphdmEvdXRpbC9MaXN0PExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9EaXJlY3Rpb247PjtMamF2YS9pby9GaWxlOylWDABEAEUBABJSZWZlcmVuY2UgU29sdXRpb24HAKkMAKsArAcArQwArgCvBwCoDACwALEMALIAswEAGXBvczFfMmFoaWYvdGVzdDIvYXBpL1RpbGUBAB1wb3MxXzJhaGlmL3Rlc3QyL2FwaS9UcmVhc3VyZQEAE2phdmEvdXRpbC9BcnJheUxpc3QMALQAtQcAtgcAtwEAE2phdmEvdXRpbC9NYXAkRW50cnkBAAVFbnRyeQwAuACzDAC5ALMMALoAuwwATgBPAQAtcG9zMV8yYWhpZi90ZXN0Mi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbiQxDABEALwHAL0MAL4AvwEALXBvczFfMmFoaWYvdGVzdDIvaW50ZXJuYWwvUmVmZXJlbmNlU29sdXRpb24kMgEAG3BvczFfMmFoaWYvdGVzdDIvYXBpL0Nvb3JkcwwARADAAQAecG9zMV8yYWhpZi90ZXN0Mi9hcGkvRGlyZWN0aW9uDADBAMIMAMMAxAEAEWphdmEvdXRpbC9IYXNoTWFwAQAycG9zMV8yYWhpZi90ZXN0Mi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbiRNeVRpbGUMAEQAxQwAxgDHDADIAMkMAMoAywwAzADNAQAOamF2YS91dGlsL0xpc3QMAM4AzwEAE2phdmEvaW8vUHJpbnRXcml0ZXIBABhqYXZhL2lvL0ZpbGVPdXRwdXRTdHJlYW0MAEQA0AwARADRAQAmcG9zMV8yYWhpZi90ZXN0Mi9hcGkvQ29sbGVjdGVkVHJlYXN1cmUBABBGZXR0ZSBCZXV0ZTogJWYKAQAQamF2YS9sYW5nL09iamVjdAwAuADSBwDTDADUANUMANYA1wwA2ADEAQAXamF2YS9sYW5nL1N0cmluZ0J1aWxkZXIBAAlLYWJvb20hICgMANkA2gwA2QDbAQABKQwA3ABIDADdAN4MAN8A4AwA3ADhDADiAEUBAB1qYXZhL2lvL0ZpbGVOb3RGb3VuZEV4Y2VwdGlvbgwA4wBFAQArcG9zMV8yYWhpZi90ZXN0Mi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbgEAHnBvczFfMmFoaWYvdGVzdDIvYXBpL0V4ZXJjaXNlcwEAEmphdmEvdXRpbC9JdGVyYXRvcgEAHnBvczFfMmFoaWYvdGVzdDIvYXBpL0xhYnlyaW50aAEADGphdmEvaW8vRmlsZQEABnZhbHVlcwEAGCgpTGphdmEvdXRpbC9Db2xsZWN0aW9uOwEAFGphdmEvdXRpbC9Db2xsZWN0aW9uAQAIaXRlcmF0b3IBABYoKUxqYXZhL3V0aWwvSXRlcmF0b3I7AQAHaGFzTmV4dAEAAygpWgEABG5leHQBABQoKUxqYXZhL2xhbmcvT2JqZWN0OwEACGVudHJ5U2V0AQARKClMamF2YS91dGlsL1NldDsBAA1qYXZhL3V0aWwvU2V0AQANamF2YS91dGlsL01hcAEACGdldFZhbHVlAQAGZ2V0S2V5AQADYWRkAQAVKExqYXZhL2xhbmcvT2JqZWN0OylaAQBQKExwb3MxXzJhaGlmL3Rlc3QyL2ludGVybmFsL1JlZmVyZW5jZVNvbHV0aW9uO0xwb3MxXzJhaGlmL3Rlc3QyL2FwaS9MYWJ5cmludGg7KVYBABVqYXZhL3V0aWwvQ29sbGVjdGlvbnMBAARzb3J0AQApKExqYXZhL3V0aWwvTGlzdDtMamF2YS91dGlsL0NvbXBhcmF0b3I7KVYBAAUoSUkpVgEAA2dldAEAJihMamF2YS9sYW5nL09iamVjdDspTGphdmEvbGFuZy9PYmplY3Q7AQAPaXNEaXJlY3Rpb25PcGVuAQAjKExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9EaXJlY3Rpb247KVoBAD8oTHBvczFfMmFoaWYvdGVzdDIvYXBpL1RpbGU7THBvczFfMmFoaWYvdGVzdDIvYXBpL0RpcmVjdGlvbjtaKVYBAANwdXQBADgoTGphdmEvbGFuZy9PYmplY3Q7TGphdmEvbGFuZy9PYmplY3Q7KUxqYXZhL2xhbmcvT2JqZWN0OwEAAmdvAQA/KExwb3MxXzJhaGlmL3Rlc3QyL2FwaS9EaXJlY3Rpb247KUxwb3MxXzJhaGlmL3Rlc3QyL2FwaS9Db29yZHM7AQAUZ2V0T3Bwb3NpdGVEaXJlY3Rpb24BACIoKUxwb3MxXzJhaGlmL3Rlc3QyL2FwaS9EaXJlY3Rpb247AQANY2xlYXJQYXNzYWdlcwEAEihMamF2YS91dGlsL01hcDspVgEABmFkZEFsbAEAGShMamF2YS91dGlsL0NvbGxlY3Rpb247KVoBABEoTGphdmEvaW8vRmlsZTspVgEAGShMamF2YS9pby9PdXRwdXRTdHJlYW07KVYBAAMoKUYBAA9qYXZhL2xhbmcvRmxvYXQBAAd2YWx1ZU9mAQAUKEYpTGphdmEvbGFuZy9GbG9hdDsBAAZwcmludGYBADwoTGphdmEvbGFuZy9TdHJpbmc7W0xqYXZhL2xhbmcvT2JqZWN0OylMamF2YS9pby9QcmludFdyaXRlcjsBABFzaG91bGRQcmludEthYm9vbQEABmFwcGVuZAEALShMamF2YS9sYW5nL1N0cmluZzspTGphdmEvbGFuZy9TdHJpbmdCdWlsZGVyOwEALShMamF2YS9sYW5nL09iamVjdDspTGphdmEvbGFuZy9TdHJpbmdCdWlsZGVyOwEACHRvU3RyaW5nAQAHcHJpbnRsbgEAFShMamF2YS9sYW5nL1N0cmluZzspVgEAC2dldE9yaWdpbmFsAQAdKClMcG9zMV8yYWhpZi90ZXN0Mi9hcGkvVGlsZTsBACQoTGphdmEvdXRpbC9MaXN0OylMamF2YS9sYW5nL1N0cmluZzsBAAVmbHVzaAEAD3ByaW50U3RhY2tUcmFjZQAhAEAALQABAEEAAAAKAAEARABFAAEARgAAABEAAQABAAAABSq3AAGxAAAAAAABAEcASAABAEYAAAAPAAEAAQAAAAMSArAAAAAAAAEASQBIAAEARgAAAA8AAQABAAAAAxICsAAAAAAAAQBKAEsAAQBGAAAASwABAAQAAAAtK7kAAwEAuQAEAQBNLLkABQEAmQAZLLkABgEAwAAHTi3BAAiZAAUErKf/5AOsAAAAAQBMAAAADAAD/AAMBwBNG/oAAgACAE4ATwACAEYAAABpAAIABQAAAEi7AAlZtwAKTSu5AAsBALkADAEATi25AAUBAJkALC25AAYBAMAADToEGQS5AA4BAMEACJkAESwZBLkADwEAuQAQAgBXp//RLLAAAAABAEwAAAAPAAP9ABQHAFAHAE0u+gACAFEAAAACAFIAAQBTAE8AAgBGAAAAIQAFAAMAAAAVKiu3ABFNLLsAElkqK7cAE7gAFCywAAAAAABRAAAAAgBSAAEAVABPAAIARgAAACEABQADAAAAFSortwARTSy7ABVZKiu3ABa4ABQssAAAAAAAUQAAAAIAUgABAFUAVgACAEYAAAC/AAcABwAAAJm7ABdZAwO3ABhOLLkAGQEAOgQZBLkABQEAmQB/GQS5AAYBAMAAGjoFKy25ABsCAMAABxkFtgAcmgBXuwAdWbcAHjoGGQYtuwAfWSstuQAbAgDAAAcZBQS3ACC2ACFXGQYtGQW2ACK7AB9ZKy0ZBbYAIrkAGwIAwAAHGQW2ACMDtwAgtgAhVysZBrkAJAIALRkFtgAiTqf/fbEAAAABAEwAAAAUAAP9ABIHAFcHAE38AHsHAFj5AAkAUQAAAAIAWQABAFoAWwACAEYAAABRAAIABQAAADG7AAlZtwAKTSu5ABkBAE4tuQAFAQCZABotuQAGAQDAACU6BCwZBLkAJgIAV6f/4yywAAAAAQBMAAAADgAC/QAPBwBQBwBN+gAfAFEAAAACAFwAAQBdAF4AAgBGAAABTAAHAAkAAAD6uwAnWbsAKFkttwAptwAqOgS7ABdZAwO3ABg6BSy5ABkBADoGGQa5AAUBAJkAsxkGuQAGAQDAABo6BysZBbkAGwIAwQArmQAlGQQSLAS9AC1ZAysZBbkAGwIAwAAIuQAuAQC4AC9TtgAwVysZBbkAGwIAwQAfmQBTKxkFuQAbAgDAAAc6CBkIwQAfmQA+GQjAAB8ZB7YAMZkAJBkEuwAyWbcAMxI0tgA1GQe2ADYSN7YANbYAOLYAOacAEBkIwAAftgA6Ogin/8AZBBkHtgA7tgA5GQUZB7YAIjoFp/9JGQQrLLkAPAIAtgA5GQS2AD2nAAo6BBkEtgA/sQABAAAA7wDyAD4AAQBMAAAAOAAI/gAkBwBfBwBXBwBN/ABFBwBY/AAaBwBgNfoADPkAFf8AEwAEBwBhBwBiBwBQBwBjAAEHAGQGAFEAAAACAGUAAQBDAAAAIgAEAB8AQABCAAoAFQAAAAAAAAASAAAAAAAAAA0AdAB2Bgk="), 0, 4655, (CodeSource) null);
        }
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
