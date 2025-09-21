package github.xcodebn.intellijiconscompose.debugger

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Threadrunning: ImageVector
    get() {
        if (_Threadrunning != null) return _Threadrunning!!

        _Threadrunning = ImageVector.Builder(
            name = "Threadrunning",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF62B543)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 2f)
                lineTo(13f, 8f)
                lineTo(3f, 14f)
                close()
            }
        }.build()

        return _Threadrunning!!
    }

private var _Threadrunning: ImageVector? = null

