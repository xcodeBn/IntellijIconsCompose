package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Junittestmark: ImageVector
    get() {
        if (_Junittestmark != null) return _Junittestmark!!

        _Junittestmark = ImageVector.Builder(
            name = "Junittestmark",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF26522))
            ) {
                moveTo(12f, 5f)
                lineTo(9f, 2f)
                lineTo(12f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(13f, 5f)
                lineTo(16f, 2f)
                lineTo(13f, 0f)
                close()
            }
        }.build()

        return _Junittestmark!!
    }

private var _Junittestmark: ImageVector? = null

