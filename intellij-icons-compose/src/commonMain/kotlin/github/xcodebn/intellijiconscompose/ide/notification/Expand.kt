package github.xcodebn.intellijiconscompose.ide.notification

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Expand: ImageVector
    get() {
        if (_Expand != null) return _Expand!!

        _Expand = ImageVector.Builder(
            name = "Expand",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(8f, 10f)
                lineTo(13f, 6f)
                lineTo(14f, 7f)
                lineTo(8f, 13f)
                lineTo(8f, 13f)
                lineTo(8f, 13f)
                lineTo(8f, 13f)
                lineTo(8f, 13f)
                lineTo(2f, 7f)
                lineTo(3f, 6f)
                lineTo(8f, 10f)
                close()
            }
        }.build()

        return _Expand!!
    }

private var _Expand: ImageVector? = null

