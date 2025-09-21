package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Rerun: ImageVector
    get() {
        if (_Rerun != null) return _Rerun!!

        _Rerun = ImageVector.Builder(
            name = "Rerun",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF59A869))
            ) {
                moveTo(2f, 3f)
                lineTo(8f, 8f)
                lineTo(2f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF59A869))
            ) {
                moveTo(9f, 3f)
                lineTo(15f, 8f)
                lineTo(9f, 13f)
                close()
            }
        }.build()

        return _Rerun!!
    }

private var _Rerun: ImageVector? = null

