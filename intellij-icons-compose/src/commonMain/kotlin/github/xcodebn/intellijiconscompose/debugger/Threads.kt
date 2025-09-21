package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Threads: ImageVector
    get() {
        if (_Threads != null) return _Threads!!

        _Threads = ImageVector.Builder(
            name = "Threads",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(2f, 2f)
                lineTo(14f, 2f)
                lineTo(12f, 4f)
                lineTo(4f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(2f, 11f)
                lineTo(14f, 11f)
                lineTo(12f, 13f)
                lineTo(4f, 13f)
                close()
            }
        }.build()

        return _Threads!!
    }

private var _Threads: ImageVector? = null

