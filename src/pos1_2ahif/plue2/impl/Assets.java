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
    private Assets() {
    }

    public static class SolutionLoader extends SecureClassLoader {
        public SolutionLoader(ClassLoader parent) {
            super(parent);

            this.defineClass("pos1_2ahif.plue2.internal.ReferenceSolution$1", DatatypeConverter.parseBase64Binary("yv66vgAAADIAOwkACwAdCQALAB4KAAwAHwsAIAAhBwAiCwAFACMKACQAJQoAJAAmBwAnCgALACgHACkHACsHACwBAA12YWwkbGFieXJpbnRoAQAgTHBvczFfMmFoaWYvcGx1ZTIvYXBpL0xhYnlyaW50aDsBAAZ0aGlzJDABAC1McG9zMV8yYWhpZi9wbHVlMi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbjsBAAY8aW5pdD4BAFAoTHBvczFfMmFoaWYvcGx1ZTIvaW50ZXJuYWwvUmVmZXJlbmNlU29sdXRpb247THBvczFfMmFoaWYvcGx1ZTIvYXBpL0xhYnlyaW50aDspVgEABENvZGUBAAdjb21wYXJlAQA9KExwb3MxXzJhaGlmL3BsdWUyL2FwaS9Db29yZHM7THBvczFfMmFoaWYvcGx1ZTIvYXBpL0Nvb3JkczspSQEAJyhMamF2YS9sYW5nL09iamVjdDtMamF2YS9sYW5nL09iamVjdDspSQEACVNpZ25hdHVyZQEAR0xqYXZhL2xhbmcvT2JqZWN0O0xqYXZhL3V0aWwvQ29tcGFyYXRvcjxMcG9zMV8yYWhpZi9wbHVlMi9hcGkvQ29vcmRzOz47AQAPRW5jbG9zaW5nTWV0aG9kBwAtDAAuAC8MABAAEQwADgAPDAASADAHADEMADIAMwEAHXBvczFfMmFoaWYvcGx1ZTIvYXBpL1RyZWFzdXJlDAA0ADUHADYMADcAOAwAOQA6AQAbcG9zMV8yYWhpZi9wbHVlMi9hcGkvQ29vcmRzDAAVABYBAC1wb3MxXzJhaGlmL3BsdWUyL2ludGVybmFsL1JlZmVyZW5jZVNvbHV0aW9uJDEBAAxJbm5lckNsYXNzZXMBABBqYXZhL2xhbmcvT2JqZWN0AQAUamF2YS91dGlsL0NvbXBhcmF0b3IBACtwb3MxXzJhaGlmL3BsdWUyL2ludGVybmFsL1JlZmVyZW5jZVNvbHV0aW9uAQAaZ2V0VHJlYXN1cmVzT3JkZXJlZEJ5VmFsdWUBADIoTHBvczFfMmFoaWYvcGx1ZTIvYXBpL0xhYnlyaW50aDspTGphdmEvdXRpbC9MaXN0OwEAAygpVgEAHnBvczFfMmFoaWYvcGx1ZTIvYXBpL0xhYnlyaW50aAEAA2dldAEAJihMamF2YS9sYW5nL09iamVjdDspTGphdmEvbGFuZy9PYmplY3Q7AQAIZ2V0VmFsdWUBAAMoKUYBAA9qYXZhL2xhbmcvRmxvYXQBAAd2YWx1ZU9mAQAUKEYpTGphdmEvbGFuZy9GbG9hdDsBAAljb21wYXJlVG8BABQoTGphdmEvbGFuZy9GbG9hdDspSQAgAAsADAABAA0AAhAQAA4ADwAAEBAAEAARAAAAAwAAABIAEwABABQAAAAbAAIAAwAAAA8qK7UAASostQACKrcAA7EAAAAAAAEAFQAWAAEAFAAAAEEAAgAFAAAANSq0AAIruQAEAgDAAAVOKrQAAiy5AAQCAMAABToELbkABgEAuAAHGQS5AAYBALgAB7YACHSsAAAAABBBABUAFwABABQAAAAZAAMAAwAAAA0qK8AACSzAAAm2AAqsAAAAAAADABgAAAACABkAGgAAAAQAGwAcACoAAAAKAAEACwAAAAAAAA=="), 0, 1255, (CodeSource) null);
            this.defineClass("pos1_2ahif.plue2.internal.ReferenceSolution$2", DatatypeConverter.parseBase64Binary("yv66vgAAADIAPgkADAAeCQAMAB8KAA0AIAsAIQAiBwAjCwAFACQLAAUAJQoAJgAnCgAmACgHACkKAAwAKgcAKwcALQcALgEADXZhbCRsYWJ5cmludGgBACBMcG9zMV8yYWhpZi9wbHVlMi9hcGkvTGFieXJpbnRoOwEABnRoaXMkMAEALUxwb3MxXzJhaGlmL3BsdWUyL2ludGVybmFsL1JlZmVyZW5jZVNvbHV0aW9uOwEABjxpbml0PgEAUChMcG9zMV8yYWhpZi9wbHVlMi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbjtMcG9zMV8yYWhpZi9wbHVlMi9hcGkvTGFieXJpbnRoOylWAQAEQ29kZQEAB2NvbXBhcmUBAD0oTHBvczFfMmFoaWYvcGx1ZTIvYXBpL0Nvb3JkcztMcG9zMV8yYWhpZi9wbHVlMi9hcGkvQ29vcmRzOylJAQAnKExqYXZhL2xhbmcvT2JqZWN0O0xqYXZhL2xhbmcvT2JqZWN0OylJAQAJU2lnbmF0dXJlAQBHTGphdmEvbGFuZy9PYmplY3Q7TGphdmEvdXRpbC9Db21wYXJhdG9yPExwb3MxXzJhaGlmL3BsdWUyL2FwaS9Db29yZHM7PjsBAA9FbmNsb3NpbmdNZXRob2QHAC8MADAAMQwAEQASDAAPABAMABMAMgcAMwwANAA1AQAdcG9zMV8yYWhpZi9wbHVlMi9hcGkvVHJlYXN1cmUMADYANwwAOAA3BwA5DAA6ADsMADwAPQEAG3BvczFfMmFoaWYvcGx1ZTIvYXBpL0Nvb3JkcwwAFgAXAQAtcG9zMV8yYWhpZi9wbHVlMi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbiQyAQAMSW5uZXJDbGFzc2VzAQAQamF2YS9sYW5nL09iamVjdAEAFGphdmEvdXRpbC9Db21wYXJhdG9yAQArcG9zMV8yYWhpZi9wbHVlMi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbgEAI2dldFRyZWFzdXJlc09yZGVyZWRCeVZhbHVlUGVyV2VpZ2h0AQAyKExwb3MxXzJhaGlmL3BsdWUyL2FwaS9MYWJ5cmludGg7KUxqYXZhL3V0aWwvTGlzdDsBAAMoKVYBAB5wb3MxXzJhaGlmL3BsdWUyL2FwaS9MYWJ5cmludGgBAANnZXQBACYoTGphdmEvbGFuZy9PYmplY3Q7KUxqYXZhL2xhbmcvT2JqZWN0OwEACGdldFZhbHVlAQADKClGAQAJZ2V0V2VpZ2h0AQAPamF2YS9sYW5nL0Zsb2F0AQAHdmFsdWVPZgEAFChGKUxqYXZhL2xhbmcvRmxvYXQ7AQAJY29tcGFyZVRvAQAUKExqYXZhL2xhbmcvRmxvYXQ7KUkAIAAMAA0AAQAOAAIQEAAPABAAABAQABEAEgAAAAMAAAATABQAAQAVAAAAGwACAAMAAAAPKiu1AAEqLLUAAiq3AAOxAAAAAAABABYAFwABABUAAABQAAMABQAAAEQqtAACK7kABAIAwAAFTiq0AAIsuQAEAgDAAAU6BC25AAYBAC25AAcBAG64AAgZBLkABgEAGQS5AAcBAG64AAi2AAl0rAAAAAAQQQAWABgAAQAVAAAAGQADAAMAAAANKivAAAoswAAKtgALrAAAAAAAAwAZAAAAAgAaABsAAAAEABwAHQAsAAAACgABAAwAAAAAAAA="), 0, 1301, (CodeSource) null);
            this.defineClass("pos1_2ahif.plue2.internal.ReferenceSolution$MyTile", DatatypeConverter.parseBase64Binary("yv66vgAAADIAKQoACAAYCQAHABkJAAcAGgkABwAbCgAcAB0KAAgAHgcAIAcAIwEACG9yaWdpbmFsAQAbTHBvczFfMmFoaWYvcGx1ZTIvYXBpL1RpbGU7AQAPZGlyZWN0aW9uT3BlbmVkAQAgTHBvczFfMmFoaWYvcGx1ZTIvYXBpL0RpcmVjdGlvbjsBAAtwcmludEthYm9vbQEAAVoBAAY8aW5pdD4BAD8oTHBvczFfMmFoaWYvcGx1ZTIvYXBpL1RpbGU7THBvczFfMmFoaWYvcGx1ZTIvYXBpL0RpcmVjdGlvbjtaKVYBAARDb2RlAQAPaXNEaXJlY3Rpb25PcGVuAQAjKExwb3MxXzJhaGlmL3BsdWUyL2FwaS9EaXJlY3Rpb247KVoBAA1TdGFja01hcFRhYmxlAQALZ2V0T3JpZ2luYWwBAB0oKUxwb3MxXzJhaGlmL3BsdWUyL2FwaS9UaWxlOwEAEXNob3VsZFByaW50S2Fib29tDAAPACQMAAkACgwACwAMDAANAA4HACUMACYAJwwAEgATBwAoAQAycG9zMV8yYWhpZi9wbHVlMi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbiRNeVRpbGUBAAZNeVRpbGUBAAxJbm5lckNsYXNzZXMBABlwb3MxXzJhaGlmL3BsdWUyL2FwaS9UaWxlAQADKClWAQAecG9zMV8yYWhpZi9wbHVlMi9hcGkvRGlyZWN0aW9uAQAGZXF1YWxzAQAVKExqYXZhL2xhbmcvT2JqZWN0OylaAQArcG9zMV8yYWhpZi9wbHVlMi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbgAgAAcACAAAAAMAEgAJAAoAAAASAAsADAAAAAIADQAOAAAABAABAA8AEAABABEAAAAgAAIABAAAABQqtwABKiu1AAIqLLUAAyodtQAEsQAAAAAAAQASABMAAQARAAAALwACAAIAAAAYKyq0AAO2AAWZAAcEpwALKrQAAiu2AAasAAAAAQAUAAAABQACD0cBAAEAFQAWAAEAEQAAABEAAQABAAAABSq0AAKwAAAAAAABABcAEwABABEAAAAuAAIAAwAAABkrKrQAA7YABZoABQOsKrQABD0qA7UABBysAAAAAQAUAAAAAwABDQABACIAAAAKAAEABwAfACEACg=="), 0, 889, (CodeSource) null);
            this.defineClass("pos1_2ahif.plue2.internal.ReferenceSolution", DatatypeConverter.parseBase64Binary("yv66vgAAADIA5AoALQBmCABnCwBoAGkLAGoAawsAbABtCwBsAG4HAG8HAHAHAHEKAAkAZgsAaAByCwBzAGsHAHULAA0AdwsADQB4CwAlAHkKAEAAegcAewoAEgB8CgB9AH4HAH8KABUAfAcAgAoAFwCBCwAlAGsHAIILAGgAgwoABwCEBwCFCgAdAGYHAIYKAB8AhwoAHQCICgAXAIkKABoAigsAaACLBwCMCwAlAI0HAI4HAI8KACgAkAoAJwCRBwCSCACTBwCUCwAIAJUKAJYAlwoAJwCYCgAfAJkHAJoKADIAZggAmwoAMgCcCgAyAJ0IAJ4KADIAnwoAJwCgCgAfAKEKABoAnwsAaACiCgAnAKMHAKQKAD4ApQcApgcApwEABk15VGlsZQEADElubmVyQ2xhc3NlcwEABjxpbml0PgEAAygpVgEABENvZGUBAAlnZXRNeU5hbWUBABQoKUxqYXZhL2xhbmcvU3RyaW5nOwEAFGdldE15RXhhbUFjY291bnROYW1lAQAOaGFzQW55VHJlYXN1cmUBACMoTHBvczFfMmFoaWYvcGx1ZTIvYXBpL0xhYnlyaW50aDspWgEADVN0YWNrTWFwVGFibGUHAKgBABRnZXRBbGxUcmVhc3VyZUNvb3JkcwEAMihMcG9zMV8yYWhpZi9wbHVlMi9hcGkvTGFieXJpbnRoOylMamF2YS91dGlsL0xpc3Q7BwCMAQAJU2lnbmF0dXJlAQBRKExwb3MxXzJhaGlmL3BsdWUyL2FwaS9MYWJ5cmludGg7KUxqYXZhL3V0aWwvTGlzdDxMcG9zMV8yYWhpZi9wbHVlMi9hcGkvQ29vcmRzOz47AQAaZ2V0VHJlYXN1cmVzT3JkZXJlZEJ5VmFsdWUBACNnZXRUcmVhc3VyZXNPcmRlcmVkQnlWYWx1ZVBlcldlaWdodAEAFmNsZWFyUGFzc2FnZXNBbG9uZ1BhdGgBADMoTHBvczFfMmFoaWYvcGx1ZTIvYXBpL0xhYnlyaW50aDtMamF2YS91dGlsL0xpc3Q7KVYHAIAHAIIBAFUoTHBvczFfMmFoaWYvcGx1ZTIvYXBpL0xhYnlyaW50aDtMamF2YS91dGlsL0xpc3Q8THBvczFfMmFoaWYvcGx1ZTIvYXBpL0RpcmVjdGlvbjs+OylWAQAJam9pblBhdGhzAQAiKExqYXZhL3V0aWwvTGlzdDspTGphdmEvdXRpbC9MaXN0OwEAeChMamF2YS91dGlsL0xpc3Q8TGphdmEvdXRpbC9MaXN0PExwb3MxXzJhaGlmL3BsdWUyL2FwaS9EaXJlY3Rpb247Pjs+OylMamF2YS91dGlsL0xpc3Q8THBvczFfMmFoaWYvcGx1ZTIvYXBpL0RpcmVjdGlvbjs+OwEAGnByaW50UmVwb3J0Rm9yVHJlYXN1cmVIdW50AQBBKExwb3MxXzJhaGlmL3BsdWUyL2FwaS9MYWJ5cmludGg7TGphdmEvdXRpbC9MaXN0O0xqYXZhL2lvL0ZpbGU7KVYHAI4HAG8HAKYHAKkHAKoHAKQBAGMoTHBvczFfMmFoaWYvcGx1ZTIvYXBpL0xhYnlyaW50aDtMamF2YS91dGlsL0xpc3Q8THBvczFfMmFoaWYvcGx1ZTIvYXBpL0RpcmVjdGlvbjs+O0xqYXZhL2lvL0ZpbGU7KVYMAEQARQEAElJlZmVyZW5jZSBTb2x1dGlvbgcAqQwAqwCsBwCtDACuAK8HAKgMALAAsQwAsgCzAQAZcG9zMV8yYWhpZi9wbHVlMi9hcGkvVGlsZQEAHXBvczFfMmFoaWYvcGx1ZTIvYXBpL1RyZWFzdXJlAQATamF2YS91dGlsL0FycmF5TGlzdAwAtAC1BwC2BwC3AQATamF2YS91dGlsL01hcCRFbnRyeQEABUVudHJ5DAC4ALMMALkAswwAugC7DABOAE8BAC1wb3MxXzJhaGlmL3BsdWUyL2ludGVybmFsL1JlZmVyZW5jZVNvbHV0aW9uJDEMAEQAvAcAvQwAvgC/AQAtcG9zMV8yYWhpZi9wbHVlMi9pbnRlcm5hbC9SZWZlcmVuY2VTb2x1dGlvbiQyAQAbcG9zMV8yYWhpZi9wbHVlMi9hcGkvQ29vcmRzDABEAMABAB5wb3MxXzJhaGlmL3BsdWUyL2FwaS9EaXJlY3Rpb24MAMEAwgwAwwDEAQARamF2YS91dGlsL0hhc2hNYXABADJwb3MxXzJhaGlmL3BsdWUyL2ludGVybmFsL1JlZmVyZW5jZVNvbHV0aW9uJE15VGlsZQwARADFDADGAMcMAMgAyQwAygDLDADMAM0BAA5qYXZhL3V0aWwvTGlzdAwAzgDPAQATamF2YS9pby9QcmludFdyaXRlcgEAGGphdmEvaW8vRmlsZU91dHB1dFN0cmVhbQwARADQDABEANEBACZwb3MxXzJhaGlmL3BsdWUyL2FwaS9Db2xsZWN0ZWRUcmVhc3VyZQEAEEZldHRlIEJldXRlOiAlZgoBABBqYXZhL2xhbmcvT2JqZWN0DAC4ANIHANMMANQA1QwA1gDXDADYAMQBABdqYXZhL2xhbmcvU3RyaW5nQnVpbGRlcgEACUthYm9vbSEgKAwA2QDaDADZANsBAAEpDADcAEgMAN0A3gwA3wDgDADcAOEMAOIARQEAHWphdmEvaW8vRmlsZU5vdEZvdW5kRXhjZXB0aW9uDADjAEUBACtwb3MxXzJhaGlmL3BsdWUyL2ludGVybmFsL1JlZmVyZW5jZVNvbHV0aW9uAQAecG9zMV8yYWhpZi9wbHVlMi9hcGkvRXhlcmNpc2VzAQASamF2YS91dGlsL0l0ZXJhdG9yAQAecG9zMV8yYWhpZi9wbHVlMi9hcGkvTGFieXJpbnRoAQAMamF2YS9pby9GaWxlAQAGdmFsdWVzAQAYKClMamF2YS91dGlsL0NvbGxlY3Rpb247AQAUamF2YS91dGlsL0NvbGxlY3Rpb24BAAhpdGVyYXRvcgEAFigpTGphdmEvdXRpbC9JdGVyYXRvcjsBAAdoYXNOZXh0AQADKClaAQAEbmV4dAEAFCgpTGphdmEvbGFuZy9PYmplY3Q7AQAIZW50cnlTZXQBABEoKUxqYXZhL3V0aWwvU2V0OwEADWphdmEvdXRpbC9TZXQBAA1qYXZhL3V0aWwvTWFwAQAIZ2V0VmFsdWUBAAZnZXRLZXkBAANhZGQBABUoTGphdmEvbGFuZy9PYmplY3Q7KVoBAFAoTHBvczFfMmFoaWYvcGx1ZTIvaW50ZXJuYWwvUmVmZXJlbmNlU29sdXRpb247THBvczFfMmFoaWYvcGx1ZTIvYXBpL0xhYnlyaW50aDspVgEAFWphdmEvdXRpbC9Db2xsZWN0aW9ucwEABHNvcnQBACkoTGphdmEvdXRpbC9MaXN0O0xqYXZhL3V0aWwvQ29tcGFyYXRvcjspVgEABShJSSlWAQADZ2V0AQAmKExqYXZhL2xhbmcvT2JqZWN0OylMamF2YS9sYW5nL09iamVjdDsBAA9pc0RpcmVjdGlvbk9wZW4BACMoTHBvczFfMmFoaWYvcGx1ZTIvYXBpL0RpcmVjdGlvbjspWgEAPyhMcG9zMV8yYWhpZi9wbHVlMi9hcGkvVGlsZTtMcG9zMV8yYWhpZi9wbHVlMi9hcGkvRGlyZWN0aW9uO1opVgEAA3B1dAEAOChMamF2YS9sYW5nL09iamVjdDtMamF2YS9sYW5nL09iamVjdDspTGphdmEvbGFuZy9PYmplY3Q7AQACZ28BAD8oTHBvczFfMmFoaWYvcGx1ZTIvYXBpL0RpcmVjdGlvbjspTHBvczFfMmFoaWYvcGx1ZTIvYXBpL0Nvb3JkczsBABRnZXRPcHBvc2l0ZURpcmVjdGlvbgEAIigpTHBvczFfMmFoaWYvcGx1ZTIvYXBpL0RpcmVjdGlvbjsBAA1jbGVhclBhc3NhZ2VzAQASKExqYXZhL3V0aWwvTWFwOylWAQAGYWRkQWxsAQAZKExqYXZhL3V0aWwvQ29sbGVjdGlvbjspWgEAEShMamF2YS9pby9GaWxlOylWAQAZKExqYXZhL2lvL091dHB1dFN0cmVhbTspVgEAAygpRgEAD2phdmEvbGFuZy9GbG9hdAEAB3ZhbHVlT2YBABQoRilMamF2YS9sYW5nL0Zsb2F0OwEABnByaW50ZgEAPChMamF2YS9sYW5nL1N0cmluZztbTGphdmEvbGFuZy9PYmplY3Q7KUxqYXZhL2lvL1ByaW50V3JpdGVyOwEAEXNob3VsZFByaW50S2Fib29tAQAGYXBwZW5kAQAtKExqYXZhL2xhbmcvU3RyaW5nOylMamF2YS9sYW5nL1N0cmluZ0J1aWxkZXI7AQAtKExqYXZhL2xhbmcvT2JqZWN0OylMamF2YS9sYW5nL1N0cmluZ0J1aWxkZXI7AQAIdG9TdHJpbmcBAAdwcmludGxuAQAVKExqYXZhL2xhbmcvU3RyaW5nOylWAQALZ2V0T3JpZ2luYWwBAB0oKUxwb3MxXzJhaGlmL3BsdWUyL2FwaS9UaWxlOwEAJChMamF2YS91dGlsL0xpc3Q7KUxqYXZhL2xhbmcvU3RyaW5nOwEABWZsdXNoAQAPcHJpbnRTdGFja1RyYWNlACEAQAAtAAEAQQAAAAoAAQBEAEUAAQBGAAAAEQABAAEAAAAFKrcAAbEAAAAAAAEARwBIAAEARgAAAA8AAQABAAAAAxICsAAAAAAAAQBJAEgAAQBGAAAADwABAAEAAAADEgKwAAAAAAABAEoASwABAEYAAABLAAEABAAAAC0ruQADAQC5AAQBAE0suQAFAQCZABksuQAGAQDAAAdOLcEACJkABQSsp//kA6wAAAABAEwAAAAMAAP8AAwHAE0b+gACAAIATgBPAAIARgAAAGkAAgAFAAAASLsACVm3AApNK7kACwEAuQAMAQBOLbkABQEAmQAsLbkABgEAwAANOgQZBLkADgEAwQAImQARLBkEuQAPAQC5ABACAFen/9EssAAAAAEATAAAAA8AA/0AFAcAUAcATS76AAIAUQAAAAIAUgABAFMATwACAEYAAAAhAAUAAwAAABUqK7cAEU0suwASWSortwATuAAULLAAAAAAAFEAAAACAFIAAQBUAE8AAgBGAAAAIQAFAAMAAAAVKiu3ABFNLLsAFVkqK7cAFrgAFCywAAAAAABRAAAAAgBSAAEAVQBWAAIARgAAAL8ABwAHAAAAmbsAF1kDA7cAGE4suQAZAQA6BBkEuQAFAQCZAH8ZBLkABgEAwAAaOgUrLbkAGwIAwAAHGQW2AByaAFe7AB1ZtwAeOgYZBi27AB9ZKy25ABsCAMAABxkFBLcAILYAIVcZBi0ZBbYAIrsAH1krLRkFtgAiuQAbAgDAAAcZBbYAIwO3ACC2ACFXKxkGuQAkAgAtGQW2ACJOp/99sQAAAAEATAAAABQAA/0AEgcAVwcATfwAewcAWPkACQBRAAAAAgBZAAEAWgBbAAIARgAAAFEAAgAFAAAAMbsACVm3AApNK7kAGQEATi25AAUBAJkAGi25AAYBAMAAJToELBkEuQAmAgBXp//jLLAAAAABAEwAAAAOAAL9AA8HAFAHAE36AB8AUQAAAAIAXAABAF0AXgACAEYAAAFMAAcACQAAAPq7ACdZuwAoWS23ACm3ACo6BLsAF1kDA7cAGDoFLLkAGQEAOgYZBrkABQEAmQCzGQa5AAYBAMAAGjoHKxkFuQAbAgDBACuZACUZBBIsBL0ALVkDKxkFuQAbAgDAAAi5AC4BALgAL1O2ADBXKxkFuQAbAgDBAB+ZAFMrGQW5ABsCAMAABzoIGQjBAB+ZAD4ZCMAAHxkHtgAxmQAkGQS7ADJZtwAzEjS2ADUZB7YANhI3tgA1tgA4tgA5pwAQGQjAAB+2ADo6CKf/wBkEGQe2ADu2ADkZBRkHtgAiOgWn/0kZBCssuQA8AgC2ADkZBLYAPacACjoEGQS2AD+xAAEAAADvAPIAPgABAEwAAAA4AAj+ACQHAF8HAFcHAE38AEUHAFj8ABoHAGA1+gAM+QAV/wATAAQHAGEHAGIHAFAHAGMAAQcAZAYAUQAAAAIAZQABAEMAAAAiAAQAHwBAAEIACgAVAAAAAAAAABIAAAAAAAAADQB0AHYGCQ=="), 0, 4657, (CodeSource) null);
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
