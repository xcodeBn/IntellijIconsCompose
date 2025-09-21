package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Annotate: ImageVector
    get() {
        if (_Annotate != null) return _Annotate!!

        _Annotate = ImageVector.Builder(
            name = "Annotate",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E)),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3f, 6f)
                lineTo(8f, 6f)
                lineTo(8f, 1f)
                lineTo(13f, 1f)
                lineTo(13f, 15f)
                lineTo(3f, 15f)
                lineTo(3f, 6f)
                close()
                moveTo(7f, 1f)
                lineTo(7f, 5f)
                lineTo(3f, 5f)
                lineTo(7f, 1f)
                close()
                moveTo(5f, 8f)
                lineTo(5f, 9f)
                lineTo(11f, 9f)
                lineTo(11f, 8f)
                lineTo(5f, 8f)
                close()
                moveTo(5f, 10f)
                lineTo(5f, 11f)
                lineTo(11f, 11f)
                lineTo(11f, 10f)
                lineTo(5f, 10f)
                close()
                moveTo(5f, 12f)
                lineTo(5f, 13f)
                lineTo(11f, 13f)
                lineTo(11f, 12f)
                lineTo(5f, 12f)
                close()
            }
        }.build()

        return _Annotate!!
    }

private var _Annotate: ImageVector? = null

