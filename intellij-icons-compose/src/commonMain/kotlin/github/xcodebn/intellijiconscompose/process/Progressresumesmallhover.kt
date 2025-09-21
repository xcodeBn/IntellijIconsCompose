package github.xcodebn.intellijiconscompose.process

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Progressresumesmallhover: ImageVector
    get() {
        if (_Progressresumesmallhover != null) return _Progressresumesmallhover!!

        _Progressresumesmallhover = ImageVector.Builder(
            name = "Progressresumesmallhover",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 1f)
                lineTo(11f, 11f)
                lineTo(-1f, 11f)
                close()
            }
        }.build()

        return _Progressresumesmallhover!!
    }

private var _Progressresumesmallhover: ImageVector? = null

