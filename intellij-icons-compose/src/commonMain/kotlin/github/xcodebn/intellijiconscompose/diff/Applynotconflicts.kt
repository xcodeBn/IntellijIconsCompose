package github.xcodebn.intellijiconscompose.diff

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Applynotconflicts: ImageVector
    get() {
        if (_Applynotconflicts != null) return _Applynotconflicts!!

        _Applynotconflicts = ImageVector.Builder(
            name = "Applynotconflicts",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(2f, 2f)
                lineTo(1f, 3f)
                lineTo(4f, 6f)
                lineTo(1f, 9f)
                lineTo(2f, 9f)
                lineTo(6f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(5f, 2f)
                lineTo(4f, 3f)
                lineTo(7f, 6f)
                lineTo(4f, 9f)
                lineTo(5f, 9f)
                lineTo(9f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(11f, 7f)
                lineTo(10f, 7f)
                lineTo(13f, 10f)
                lineTo(10f, 13f)
                lineTo(11f, 14f)
                lineTo(15f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(8f, 7f)
                lineTo(7f, 7f)
                lineTo(10f, 10f)
                lineTo(7f, 13f)
                lineTo(8f, 14f)
                lineTo(12f, 10f)
                close()
            }
        }.build()

        return _Applynotconflicts!!
    }

private var _Applynotconflicts: ImageVector? = null

