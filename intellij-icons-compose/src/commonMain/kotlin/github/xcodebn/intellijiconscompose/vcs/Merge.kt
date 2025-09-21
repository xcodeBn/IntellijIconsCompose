package github.xcodebn.intellijiconscompose.vcs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Merge: ImageVector
    get() {
        if (_Merge != null) return _Merge!!

        _Merge = ImageVector.Builder(
            name = "Merge",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 11f)
                lineTo(8f, 10f)
                lineTo(12f, 12f)
                lineTo(10f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 12f)
                lineTo(5f, 8f)
                lineTo(5f, 4f)
                lineTo(7f, 4f)
                lineTo(7f, 9f)
                lineTo(2f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 0f)
                lineTo(10f, 4f)
                lineTo(2f, 4f)
                close()
            }
        }.build()

        return _Merge!!
    }

private var _Merge: ImageVector? = null

