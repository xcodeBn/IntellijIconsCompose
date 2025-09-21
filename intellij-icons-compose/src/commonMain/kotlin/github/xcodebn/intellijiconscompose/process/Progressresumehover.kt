package github.xcodebn.intellijiconscompose.process

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Progressresumehover: ImageVector
    get() {
        if (_Progressresumehover != null) return _Progressresumehover!!

        _Progressresumehover = ImageVector.Builder(
            name = "Progressresumehover",
            defaultWidth = 14.0.dp,
            defaultHeight = 14.0.dp,
            viewportWidth = 14.0f,
            viewportHeight = 14.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 1f)
                lineTo(13f, 13f)
                lineTo(-1f, 13f)
                close()
            }
        }.build()

        return _Progressresumehover!!
    }

private var _Progressresumehover: ImageVector? = null

