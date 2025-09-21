package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tododefault: ImageVector
    get() {
        if (_Tododefault != null) return _Tododefault!!

        _Tododefault = ImageVector.Builder(
            name = "Tododefault",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(2f, 2f)
                lineTo(14f, 2f)
                lineTo(14f, 14f)
                lineTo(2f, 14f)
                lineTo(2f, 2f)
                close()
                moveTo(5f, 5f)
                lineTo(5f, 6f)
                lineTo(11f, 6f)
                lineTo(11f, 5f)
                lineTo(5f, 5f)
                close()
                moveTo(5f, 7f)
                lineTo(5f, 8f)
                lineTo(11f, 8f)
                lineTo(11f, 7f)
                lineTo(5f, 7f)
                close()
                moveTo(5f, 9f)
                lineTo(5f, 10f)
                lineTo(11f, 10f)
                lineTo(11f, 9f)
                lineTo(5f, 9f)
                close()
            }
        }.build()

        return _Tododefault!!
    }

private var _Tododefault: ImageVector? = null

