package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Threadcurrent: ImageVector
    get() {
        if (_Threadcurrent != null) return _Threadcurrent!!

        _Threadcurrent = ImageVector.Builder(
            name = "Threadcurrent",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF26522))
            ) {
                moveTo(14f, 2f)
                lineTo(16f, 4f)
                lineTo(7f, 13f)
                lineTo(2f, 8f)
                lineTo(4f, 7f)
                lineTo(7f, 9f)
                close()
            }
        }.build()

        return _Threadcurrent!!
    }

private var _Threadcurrent: ImageVector? = null

