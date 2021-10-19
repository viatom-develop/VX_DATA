package com.lepu.serial.obj

object EcgDemoWave {

    private val waveI = shortArrayOf(0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1ffc,0x1ffe,0x2000,0x2002,0x2003,0x2005,0x2006,0x2007,0x2008,0x2008,0x2008,0x2008,0x2007,0x2006,0x2005,0x2003,0x2002,0x2000,0x1ffe,0x1ffc,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FF8,0x1FF6,0x1FF3,0x1FEE,0x2001,0x2016,0x202C,0x2042,0x2058,0x206D,0x205A,0x2044,0x202F,0x2018,0x2005,0x1FF0,0x1FF2,0x1FF4,0x1FF7,0x1FFA,0x1FFB,0x1FFB,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1ffc,0x1ffd,0x1fff,0x2000,0x2002,0x2004,0x2005,0x2006,0x2008,0x2009,0x200a,0x200b,0x200c,0x200d,0x200e,0x200e,0x200f,0x200f,0x200f,0x2010,0x200f,0x200f,0x200f,0x200e,0x200e,0x200d,0x200c,0x200b,0x200a,0x2009,0x2008,0x2006,0x2005,0x2004,0x2002,0x2000,0x1fff,0x1ffd,0x1ffc,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFD,0x1FFD,0x1FFB,0x1FFB,0x1FFD,0x2007,0x2011,0x201B,0x2024,0x2030,0x203A,0x2043,0x204E,0x205A,0x2060,0x2067,0x206D,0x2073,0x2078,0x207B,0x207D,0x207F,0x207F,0x207D,0x207B,0x2078,0x2073,0x206D,0x2067,0x2060,0x205A,0x204F,0x2047,0x203B,0x2032,0x2026,0x201C,0x2010,0x2007,0x1FFD,0x1FF1,0x1FF0,0x1FED,0x1FE9,0x1FE7,0x1FE4,0x1FE2,0x1FE1,0x1FDD,0x1FD9,0x1FDB,0x1FD7,0x1FD3,0x1FD2,0x1FCF,0x1FCF,0x1FCD,0x1FC8,0x1FC8,0x1FC5,0x1FC0,0x1FBC,0x1FB9,0x1FB7,0x1FB6,0x1FB2,0x1FB0,0x1FAF,0x1FAF,0x1FAA,0x1FA9,0x1FA8,0x1FA7,0x1FA8,0x1FA9,0x1FA7,0x1FA8,0x1FA9,0x1FA8,0x1FAA,0x1FAC,0x1FAF,0x1FB1,0x1FB3,0x1FB5,0x1FB6,0x1FBB,0x1FBF,0x1FC7,0x1FCC,0x1FD3,0x1FD9,0x1FDF,0x1FE5,0x1FE8,0x1FEA,0x1FEC,0x1FEE,0x1FF1,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC)
    val waveII = shortArrayOf(0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1ffc,0x1fff,0x2002,0x2005,0x2008,0x200a,0x200c,0x200e,0x200f,0x200f,0x200f,0x200f,0x200e,0x200c,0x200a,0x2008,0x2005,0x2002,0x1fff,0x1ffc,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FF3,0x1FEE,0x1FE9,0x1FE2,0x2002,0x202A,0x204F,0x2075,0x209B,0x20C1,0x209E,0x2078,0x2051,0x2029,0x2002,0x1FDC,0x1FE2,0x1FE8,0x1FEE,0x1FF8,0x1FF8,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1ffc,0x1ffe,0x2001,0x2004,0x2006,0x2009,0x200c,0x200e,0x2010,0x2012,0x2014,0x2016,0x2018,0x2019,0x201a,0x201b,0x201c,0x201c,0x201c,0x201c,0x201c,0x201c,0x201b,0x201a,0x2019,0x2018,0x2016,0x2014,0x2012,0x2010,0x200e,0x200c,0x2009,0x2006,0x2004,0x2001,0x1ffe,0x1ffc,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FF5,0x1FF7,0x1FF6,0x1FEF,0x1FE2,0x1FD3,0x1FC5,0x1FB5,0x1FA5,0x1F97,0x1F8A,0x1F80,0x1F7B,0x1F7B,0x1F78,0x1F78,0x1F74,0x1F6F,0x1F69,0x1F64,0x1F57,0x1F4C,0x1F3D,0x1F33,0x1F39,0x1F43,0x1F48,0x1F50,0x1F5D,0x1F69,0x1F7B,0x1F8A,0x1F95,0x1FA5,0x1FB4,0x1FC3,0x1FD1,0x1FE1,0x1FEE,0x1FFA,0x1FFC,0x1FFF,0x2001,0x2003,0x2006,0x200A,0x200F,0x200E,0x2010,0x2011,0x2014,0x2018,0x2019,0x201B,0x201D,0x2021,0x2025,0x2027,0x202B,0x202B,0x2031,0x2034,0x2037,0x2037,0x203A,0x203C,0x203F,0x203F,0x2041,0x2042,0x2043,0x2045,0x2044,0x2041,0x2040,0x2043,0x2042,0x2042,0x203E,0x203B,0x203B,0x203A,0x2037,0x2033,0x2031,0x202B,0x2026,0x201E,0x2017,0x2010,0x200D,0x2009,0x2004,0x2001,0x1FFE,0x1FFF,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC)
    val waveV = shortArrayOf(0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1ffc,0x1ffd,0x1fff,0x2000,0x2002,0x2003,0x2004,0x2005,0x2006,0x2006,0x2006,0x2006,0x2006,0x2006,0x2005,0x2004,0x2003,0x2002,0x2000,0x1fff,0x1ffd,0x1ffc,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFE,0x1FFF,0x2000,0x1FFD,0x2001,0x2007,0x200B,0x2012,0x201B,0x201F,0x2011,0x2001,0x1FF2,0x1FE4,0x1FD5,0x1FC5,0x1FD3,0x1FE2,0x1FEF,0x1FFD,0x1FFF,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1ffc,0x1ffd,0x1ffe,0x1fff,0x1fff,0x2000,0x2001,0x2002,0x2003,0x2004,0x2005,0x2005,0x2006,0x2006,0x2007,0x2007,0x2007,0x2007,0x2007,0x2007,0x2007,0x2007,0x2007,0x2007,0x2006,0x2006,0x2005,0x2005,0x2004,0x2003,0x2002,0x2001,0x2000,0x1fff,0x1fff,0x1ffe,0x1ffd,0x1ffc,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0x1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0x2000,0x1FFF,0x1FFE,0x2000,0x2007,0x200E,0x2016,0x201D,0x2025,0x202C,0x2033,0x203A,0x2040,0x2048,0x204E,0x2055,0x2059,0x205E,0x2063,0x2067,0x2067,0x206C,0x206E,0x206D,0x2065,0x205F,0x2059,0x2052,0x2048,0x2041,0x203B,0x2033,0x202C,0x2026,0x201F,0x2016,0x200F,0x2009,0x2003,0x1FFC,0x1FFB,0x1FF8,0x1FF7,0x1FF6,0x1FF3,0x1FF2,0x1FF0,0x1FEE,0x1FED,0x1FEC,0x1FEB,0x1FE8,0x1FE6,0x1FE4,0x1FE4,0x1FE3,0x1FE1,0x1FDE,0x1FDC,0x1FDA,0x1FDA,0x1FDA,0x1FD7,0x1FD6,0x1FD4,0x1FD3,0x1FD0,0x1FD0,0x1FCE,0x1FCD,0x1FCC,0x1FD0,0x1FCE,0x1FCF,0x1FCD,0x1FCE,0x1FCD,0x1FCE,0x1FD0,0x1FD2,0x1FD4,0x1FD4,0x1FD5,0x1FD7,0x1FD9,0x1FDC,0x1FE2,0x1FE4,0x1FE7,0x1FEB,0x1FEE,0x1FF6,0x1FF6,0x1FF7,0x1FF8,0x1FF9,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC,0X1FFC)


    public val I = Array<Short>(500) { i ->  (waveI[i]-0x8000).toShort()}
    public val II = Array<Short>(500) { i ->  (waveII[i]-0x8000).toShort()}
    // III = II - I
    public val III = shortArrayOf()
    // aVR = -(I+II)/2
    public val aVR = shortArrayOf()
    // aVL = (2*I-II)/2
    public val aVL = shortArrayOf()
    // aVF = (2*II-I)/2
    public val aVF = shortArrayOf()
    // v1
    public val ecgV = Array<Short>(500) { i ->  (waveV[i]-0x8000).toShort()}
}