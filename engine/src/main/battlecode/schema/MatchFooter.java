// automatically generated by the FlatBuffers compiler, do not modify

package battlecode.schema;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
/**
 * Sent to end a match.
 */
public final class MatchFooter extends Table {
  public static MatchFooter getRootAsMatchFooter(ByteBuffer _bb) { return getRootAsMatchFooter(_bb, new MatchFooter()); }
  public static MatchFooter getRootAsMatchFooter(ByteBuffer _bb, MatchFooter obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public MatchFooter __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  /**
   * The ID of the winning team.
   */
  public byte winner() { int o = __offset(4); return o != 0 ? bb.get(o + bb_pos) : 0; }
  /**
   * The number of rounds played.
   */
  public int totalRounds() { int o = __offset(6); return o != 0 ? bb.getInt(o + bb_pos) : 0; }
  /**
   * Profiler data for team A and B if profiling is enabled
   */
  public ProfilerFile profilerFiles(int j) { return profilerFiles(new ProfilerFile(), j); }
  public ProfilerFile profilerFiles(ProfilerFile obj, int j) { int o = __offset(8); return o != 0 ? obj.__init(__indirect(__vector(o) + j * 4), bb) : null; }
  public int profilerFilesLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }

  public static int createMatchFooter(FlatBufferBuilder builder,
      byte winner,
      int totalRounds,
      int profilerFilesOffset) {
    builder.startObject(3);
    MatchFooter.addProfilerFiles(builder, profilerFilesOffset);
    MatchFooter.addTotalRounds(builder, totalRounds);
    MatchFooter.addWinner(builder, winner);
    return MatchFooter.endMatchFooter(builder);
  }

  public static void startMatchFooter(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addWinner(FlatBufferBuilder builder, byte winner) { builder.addByte(0, winner, 0); }
  public static void addTotalRounds(FlatBufferBuilder builder, int totalRounds) { builder.addInt(1, totalRounds, 0); }
  public static void addProfilerFiles(FlatBufferBuilder builder, int profilerFilesOffset) { builder.addOffset(2, profilerFilesOffset, 0); }
  public static int createProfilerFilesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startProfilerFilesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endMatchFooter(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

