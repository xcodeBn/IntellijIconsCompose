package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Threadgroupcurrent: ImageVector
    get() {
        if (_Threadgroupcurrent != null) return _Threadgroupcurrent!!

        _Threadgroupcurrent = ImageVector.Builder(
            name = "Threadgroupcurrent",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(2f, 2f)
                lineTo(14f, 2f)
                lineTo(12f, 4f)
                lineTo(4f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(2f, 11f)
                lineTo(4f, 11f)
                lineTo(6f, 13f)
                lineTo(4f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(4f, 8f)
                lineTo(12f, 8f)
                lineTo(10f, 10f)
                lineTo(4f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF26522))
            ) {
                moveTo(15f, 7f)
                lineTo(16f, 8f)
                lineTo(9f, 15f)
                lineTo(6f, 12f)
                lineTo(7f, 10f)
                lineTo(9f, 12f)
                close()
            }
        }.build()

        return _Threadgroupcurrent!!
    }

private var _Threadgroupcurrent: ImageVector? = null

