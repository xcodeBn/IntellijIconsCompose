package github.xcodebn.intellijiconscompose.toolwindows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Problemsempty: ImageVector
    get() {
        if (_Problemsempty != null) return _Problemsempty!!

        _Problemsempty = ImageVector.Builder(
            name = "Problemsempty",
            defaultWidth = 13.0.dp,
            defaultHeight = 13.0.dp,
            viewportWidth = 13.0f,
            viewportHeight = 13.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(6f, 1f)
                lineTo(12f, 11f)
                lineTo(0f, 11f)
                lineTo(6f, 1f)
                close()
                moveTo(7f, 10f)
                lineTo(7f, 8f)
                lineTo(6f, 8f)
                lineTo(6f, 10f)
                lineTo(7f, 10f)
                close()
                moveTo(7f, 8f)
                lineTo(7f, 4f)
                lineTo(6f, 4f)
                lineTo(6f, 8f)
                lineTo(7f, 8f)
                close()
            }
        }.build()

        return _Problemsempty!!
    }

private var _Problemsempty: ImageVector? = null

