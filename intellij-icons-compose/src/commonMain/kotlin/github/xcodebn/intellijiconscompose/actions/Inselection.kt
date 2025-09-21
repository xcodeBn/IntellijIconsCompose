package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Inselection: ImageVector
    get() {
        if (_Inselection != null) return _Inselection!!

        _Inselection = ImageVector.Builder(
            name = "Inselection",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 0f)
                lineTo(11f, 0f)
                lineTo(11f, 2f)
                lineTo(0f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 4f)
                lineTo(6f, 4f)
                lineTo(6f, 6f)
                lineTo(0f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 8f)
                lineTo(6f, 8f)
                lineTo(6f, 10f)
                lineTo(0f, 10f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 5f)
                lineTo(11f, 5f)
                lineTo(11f, 11f)
                lineTo(10f, 11f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 4f)
                lineTo(13f, 4f)
                lineTo(13f, 5f)
                lineTo(8f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 11f)
                lineTo(13f, 11f)
                lineTo(13f, 12f)
                lineTo(8f, 12f)
                close()
            }
        }.build()

        return _Inselection!!
    }

private var _Inselection: ImageVector? = null

