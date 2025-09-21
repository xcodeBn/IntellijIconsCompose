package github.xcodebn.intellijiconscompose.vcs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Patch: ImageVector
    get() {
        if (_Patch != null) return _Patch!!

        _Patch = ImageVector.Builder(
            name = "Patch",
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
                moveTo(6f, 9f)
                lineTo(4f, 9f)
                lineTo(4f, 10f)
                lineTo(6f, 10f)
                lineTo(6f, 12f)
                lineTo(7f, 12f)
                lineTo(7f, 10f)
                lineTo(9f, 10f)
                lineTo(9f, 9f)
                lineTo(7f, 9f)
                lineTo(7f, 7f)
                lineTo(6f, 7f)
                lineTo(6f, 9f)
                close()
                moveTo(4f, 13f)
                lineTo(4f, 14f)
                lineTo(9f, 14f)
                lineTo(9f, 13f)
                lineTo(4f, 13f)
                close()
                moveTo(7f, 1f)
                lineTo(7f, 5f)
                lineTo(3f, 5f)
                lineTo(7f, 1f)
                close()
            }
        }.build()

        return _Patch!!
    }

private var _Patch: ImageVector? = null

